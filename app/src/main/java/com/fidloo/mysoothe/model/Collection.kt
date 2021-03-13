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
package com.fidloo.mysoothe.model

data class Collection(
    val name: String,
    val imageUrl: String
)

val collections = listOf(
    Collection("Short mantras", "https://images.pexels.com/photos/5489194/pexels-photo-5489194.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
    Collection("Nature meditations", "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"),
    Collection("Stress and anxiety", "https://images.pexels.com/photos/1557238/pexels-photo-1557238.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"),
    Collection("Self-massage", "https://images.pexels.com/photos/1029604/pexels-photo-1029604.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"),
    Collection("Overwhelmed", "https://images.pexels.com/photos/3560044/pexels-photo-3560044.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"),
    Collection("Nightly wind down", "https://images.pexels.com/photos/924824/pexels-photo-924824.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"),
)
