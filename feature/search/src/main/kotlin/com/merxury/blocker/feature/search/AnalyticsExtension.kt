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

package com.merxury.blocker.feature.search

import com.merxury.blocker.core.analytics.AnalyticsEvent
import com.merxury.blocker.core.analytics.AnalyticsEvent.Param
import com.merxury.blocker.core.analytics.AnalyticsHelper

internal fun AnalyticsHelper.logAppSearchResultClicked() =
    logEvent(
        AnalyticsEvent(
            type = "search_screen_app_result_clicked",
        ),
    )

internal fun AnalyticsHelper.logComponentSearchResultClicked() =
    logEvent(
        AnalyticsEvent(
            type = "search_screen_component_result_clicked",
        ),
    )

internal fun AnalyticsHelper.logRuleSearchResultClicked(id: Int) =
    logEvent(
        AnalyticsEvent(
            type = "search_screen_rule_result_clicked",
            extras = listOf(
                Param(key = "id", value = id.toString()),
            ),
        ),
    )
