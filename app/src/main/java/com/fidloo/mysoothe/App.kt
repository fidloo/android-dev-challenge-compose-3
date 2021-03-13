package com.fidloo.mysoothe

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.fidloo.mysoothe.ui.NavGraph
import com.fidloo.mysoothe.ui.utils.LocalBackDispatcher
import com.fidloo.mysoothe.ui.utils.ProvideImageLoader
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

@Composable
fun App(backDispatcher: OnBackPressedDispatcher) {

    CompositionLocalProvider(LocalBackDispatcher provides backDispatcher) {
        ProvideWindowInsets {
            ProvideImageLoader {
                NavGraph()
            }
        }
    }
}