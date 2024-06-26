package com.example.a6706220090_assesment2.navigation

import com.example.a6706220090_assesment2.ui.Screen.KEY_ID


sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object About:Screen("About")
    data object FormUbah: Screen("detailScreen/{$KEY_ID}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}