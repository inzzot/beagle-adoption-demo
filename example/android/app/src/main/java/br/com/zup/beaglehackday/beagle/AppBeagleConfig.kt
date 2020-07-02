/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.zup.beaglehackday.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

private const val BASE_PROJECT_CHARLES_URL = "https://charles-prod.continuousplatform.com/hack-day"

@BeagleComponent
class AppBeagleConfig(
    override val isLoggingEnabled: Boolean = true,
    override val baseUrl: String = "http://10.0.2.2:8080",
    override val cache: Cache = Cache(enabled = false, maxAge = 5L, memoryMaximumCapacity = 1),
    override val environment: Environment = Environment.DEBUG
) : BeagleConfig
