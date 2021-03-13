/*
 * Copyright 2021 The Android Open Source Project
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
package com.fidloo.mysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.fidloo.mysoothe.R

private val KulimPark = FontFamily(
    Font(R.font.kulimpark_regular),
    Font(R.font.kulimpark_light, FontWeight.Light),
)

private val Lato = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold, FontWeight.Bold),
)

val typography = typographyFromDefaults(
    h1 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = 1.15.em
    ),
    h2 = TextStyle(
        fontFamily = KulimPark,
        fontSize = 15.sp,
        letterSpacing = 1.15.em,

        ),
    h3 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.em,
    ),
    body1 = TextStyle(
        fontFamily = Lato,
        fontSize = 14.sp,
        letterSpacing = 0.em,
    ),
    button = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15.em,
    ),
    caption = TextStyle(
        fontFamily = KulimPark,
        fontSize = 12.sp,
        letterSpacing = 1.15.em,
    ),
)

fun typographyFromDefaults(
    h1: TextStyle?,
    h2: TextStyle?,
    h3: TextStyle?,
    body1: TextStyle?,
    button: TextStyle?,
    caption: TextStyle?,
): Typography {
    val defaults = Typography()
    return Typography(
        h1 = defaults.h1.merge(h1),
        h2 = defaults.h2.merge(h2),
        h3 = defaults.h3.merge(h3),
        body1 = defaults.body1.merge(body1),
        button = defaults.button.merge(button),
        caption = defaults.caption.merge(caption),
    )
}
