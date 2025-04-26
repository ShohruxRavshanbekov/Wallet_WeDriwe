package uz.futuresoft.features.cards

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.futuresoft.common.R.string
import uz.futuresoft.common.utils.Event
import uz.futuresoft.common.utils.UiText
import uz.futuresoft.domain.models.NewCard
import uz.futuresoft.domain.repository.CardsRepository
import uz.futuresoft.domain.utils.ApiError
import uz.futuresoft.domain.utils.onError
import uz.futuresoft.domain.utils.onSuccess
import uz.futuresoft.features.cards.utils.CardField
import uz.futuresoft.features.cards.utils.asUiText

class AddNewCardViewModel(
    private val cardsRepository: CardsRepository,
) : ViewModel() {
    private val _state = MutableStateFlow(AddNewCardState())
    val state: StateFlow<AddNewCardState> = _state.asStateFlow()

    fun handleIntent(intent: AddNewCardIntent) {
        when (intent) {
            is AddNewCardIntent.OnInputDigit -> onInputDigit(
                digit = intent.digit,
                focusedField = intent.focusedField
            )

            is AddNewCardIntent.OnRemoveDigit -> onRemoveDigit(focusedField = intent.focusedField)
            is AddNewCardIntent.SubmitCard -> submitCard(
                cardNumber = intent.cardNumber,
                cardExpireDate = intent.cardExpireDate
            )

            else -> Unit
        }
    }

    private fun onInputDigit(digit: String, focusedField: CardField?) {
        when (focusedField) {
            CardField.NUMBER -> {
                val existingCardNumber = _state.value.cardNumber
                val newCardNumber =
                    if (existingCardNumber.length < 16) existingCardNumber.plus(digit) else existingCardNumber
                _state.update { it.copy(cardNumber = newCardNumber) }
            }

            CardField.EXPIRE_DATE -> {
                val existingCardExpireDate = _state.value.cardExpireDate
                val newCardExpireDate =
                    if (existingCardExpireDate.length < 4) existingCardExpireDate.plus(digit) else existingCardExpireDate
                _state.update { it.copy(cardExpireDate = newCardExpireDate) }
            }

            null -> Unit
        }
    }

    private fun onRemoveDigit(focusedField: CardField?) {
        when (focusedField) {
            CardField.NUMBER -> {
                val existingCardNumber = _state.value.cardNumber
                val newCardNumber = if (existingCardNumber.isNotEmpty()) {
                    existingCardNumber.substring(0, existingCardNumber.length - 1)
                } else {
                    existingCardNumber
                }
                _state.update { it.copy(cardNumber = newCardNumber) }
            }

            CardField.EXPIRE_DATE -> {
                val existingCardExpireDate = _state.value.cardExpireDate
                val newCardExpireDate = if (existingCardExpireDate.isNotEmpty()) {
                    existingCardExpireDate.substring(0, existingCardExpireDate.length - 1)
                } else {
                    existingCardExpireDate
                }
                _state.update { it.copy(cardExpireDate = newCardExpireDate) }
            }

            null -> Unit
        }
    }

    private fun submitCard(cardNumber: String, cardExpireDate: String) {
        _state.update { it.copy(loading = true) }
        viewModelScope.launch {
            cardsRepository.addCard(
                card = NewCard(number = cardNumber, expireDate = cardExpireDate)
            )
                .onSuccess {
                    _state.update {
                        it.copy(
                            loading = false,
                            successMessage = Event(content = UiText.StringResource(string.successfully_added)),
                        )
                    }
                }
                .onError { error ->
                    _state.update {
                        it.copy(
                            loading = false,
                            error = Event(content = (error as ApiError).asUiText())
                        )
                    }
                }
        }
    }
}