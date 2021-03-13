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

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

val gray800 = Color(0xCC333333)
val gray900 = Color(0xff333333)
val rust300 = Color(0xFFE1AFAF)
val rust600 = Color(0xFF886363)
val taupe100 = Color(0xfff0eae2)
val taupe800 = Color(0xff655454)
val white150 = Color(0x26FFFFFF)
val white800 = Color(0xCCFFFFFF)
val white850 = Color(0xD9FFFFFF)
val white = Color(0xFFFFFFFF)



val yellow200 = Color(0xffffeb46)
val yellow400 = Color(0xffffc000)
val yellow500 = Color(0xffffde03)
val yellowDarkPrimary = Color(0xff242316)

val blue200 = Color(0xff91a4fc)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

val pink200 = Color(0xffff7597)
val pink500 = Color(0xffff0266)
val pink600 = Color(0xffd8004d)
val pinkDarkPrimary = Color(0xff24191c)

@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}
