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

package com.fidloo.mysoothe.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.fidloo.mysoothe.ui.login.Login
import com.fidloo.mysoothe.ui.welcome.Welcome

object MainDestinations {
    const val WELCOME_ROUTE = "welcome"
    const val LOGIN_ROUTE = "login"
    const val HOME_ROUTE = "home"
}

@Composable
fun NavGraph(startDestination: String = MainDestinations.LOGIN_ROUTE) {
    val navController = rememberNavController()

    val actions = remember(navController) { MainActions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.WELCOME_ROUTE) {
            Welcome(onLogInClicked = actions.welcomeComplete)
        }
        composable(MainDestinations.LOGIN_ROUTE) {
            Login(onLogInClicked = actions.loginComplete)
        }
        composable(MainDestinations.HOME_ROUTE,) { backStackEntry ->
//            val arguments = requireNotNull(backStackEntry.arguments)
//            CourseDetails(
//                courseId = arguments.getLong(COURSE_DETAIL_ID_KEY),
//                selectCourse = actions.loginComplete,
//                upPress = actions.upPress
//            )
        }
    }
}

class MainActions(navController: NavHostController) {
    val welcomeComplete: () -> Unit = {
        navController.navigate(MainDestinations.LOGIN_ROUTE)
    }
    val loginComplete: () -> Unit = {
        navController.navigate(MainDestinations.HOME_ROUTE)
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}
