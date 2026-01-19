package screens.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class MainViewModelUiState(
    val text: String
)

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MainViewModelUiState("Hello World"))
    val uiState: StateFlow<MainViewModelUiState> = _uiState
}

