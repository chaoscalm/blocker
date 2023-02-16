/*
 * Copyright 2023 Blocker
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

package com.merxury.blocker.feature.appdetail

sealed class Screen(val name: String, val title: Int = 0) {
    object Detail : Screen(DETAIL, title = R.string.app_info)
    object Receiver : Screen(RECEIVER, title = R.string.receiver)
    object Service : Screen(SERVICE, title = R.string.service)
    object Activity : Screen(ACTIVITY, title = R.string.activity)
    object Provider : Screen(PROVIDER, title = R.string.content_provider)

    override fun toString(): String {
        return "Screen name = $name"
    }

    companion object {
        private const val DETAIL = "detail"
        private const val RECEIVER = "receiver"
        private const val SERVICE = "service"
        private const val ACTIVITY = "activity"
        private const val PROVIDER = "provider"

        fun fromName(name: String?): Screen = when (name) {
            DETAIL -> Detail
            RECEIVER -> Receiver
            SERVICE -> Service
            ACTIVITY -> Activity
            PROVIDER -> Provider
            else -> throw IllegalArgumentException("Invalid screen name in detail page")
        }
    }
}
