package com.example.unscramble.ui

data class GameUiState(
    val currentScrambleWord: String = "",
    val score: Int = 0,
    val currentWordCount: Int = 1,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)