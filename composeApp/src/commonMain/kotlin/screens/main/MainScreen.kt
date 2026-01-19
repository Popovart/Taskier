package screens.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun MainScreen(
    viewModel: MainViewModel
) {
    val state = viewModel.uiState.collectAsState().value
    Text(state.text)
}