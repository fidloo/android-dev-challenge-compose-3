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

package com.fidloo.mysoothe.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.fidloo.mysoothe.R
import com.fidloo.mysoothe.ui.component.PrimaryButton
import com.fidloo.mysoothe.ui.component.SecondaryButton

@Composable
fun Login(
    onLogInClicked: () -> Unit
) {
    val background = if (isSystemInDarkTheme()) {
        R.drawable.dark_login
    } else {
        R.drawable.light_login
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
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Log in".toUpperCase(),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier.paddingFromBaseline(200.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        TextField(
            value = "Email address",
            onValueChange = { },
            colors = TextFieldDefaults.textFieldColors(textColor = MaterialTheme.colors.onSurface),
            textStyle = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = "Password",
            onValueChange = { },
            colors = TextFieldDefaults.textFieldColors(textColor = MaterialTheme.colors.onSurface),
            textStyle = MaterialTheme.typography.body1,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        PrimaryButton(
            onClick = {},
            text = "Sign up"
        )
        Row {
            Text(
                text = "Don't have an account?",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.paddingFromBaseline(32.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Sign up",
                style = MaterialTheme.typography.body1.copy(textDecoration = TextDecoration.Underline),
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.paddingFromBaseline(32.dp)
            )
        }
    }
}

