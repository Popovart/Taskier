package com.example.taskier2

import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin

fun MainViewController() = run {
    initKoin()
    ComposeUIViewController { App() }
}