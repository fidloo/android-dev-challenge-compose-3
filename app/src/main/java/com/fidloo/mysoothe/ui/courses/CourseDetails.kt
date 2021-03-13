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

package com.fidloo.mysoothe.ui.courses

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.insets.navigationBarsPadding
import dev.chrisbanes.accompanist.insets.statusBarsPadding

private val FabSize = 56.dp
private const val ExpandedSheetAlpha = 0.96f

@Composable
fun CourseDetails(
    courseId: Long,
    selectCourse: (Long) -> Unit,
    upPress: () -> Unit
) {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        CoursesAppBar()
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses")
        Text("sergrgses", Modifier.clickable { upPress() })
    }
}
