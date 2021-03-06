/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fidloo.mysoothe.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fidloo.mysoothe.R
import com.fidloo.mysoothe.ui.component.PrimaryButton
import com.fidloo.mysoothe.ui.component.SecondaryButton

@Composable
fun Welcome(
    onLogInClicked: () -> Unit
) {
    val background = if (isSystemInDarkTheme()) {
        R.drawable.dark_welcome
    } else {
        R.drawable.light_welcome
    }

    Image(
        painter = painterResource(id = background),
        contentDescription = null,
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.fillMaxHeight()
    )

    val logo = if (isSystemInDarkTheme()) R.drawable.dark_logo else R.drawable.light_logo
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Image(
            painter = painterResource(id = logo),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(32.dp))
        PrimaryButton(
            onClick = {},
            text = "Sign up"
        )
        Spacer(modifier = Modifier.height(8.dp))
        SecondaryButton(
            onClick = onLogInClicked,
            text = "Log in"
        )
    }
}
