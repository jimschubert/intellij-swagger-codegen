/*
 * Copyright (c) 2020 Jim Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package us.jimschubert.intellij.openapitools

import com.intellij.CommonBundle
import java.util.*

internal class Message {
    companion object {
        private const val bundleName = "messages.GeneratorBundle"
        private val bundle: ResourceBundle = ResourceBundle.getBundle(bundleName)
        infix fun of(key: String): String {
            return CommonBundle.message(bundle, key, listOf<Any>())
        }

        fun of(key: String, vararg params: Any): String {
            return CommonBundle.message(bundle, key, *params)
        }

        @Suppress("NOTHING_TO_INLINE", "unused")
        inline fun message(key: String, vararg params: Any) : String = Message.of(key, params)
    }
}