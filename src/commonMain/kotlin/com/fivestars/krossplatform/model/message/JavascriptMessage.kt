package com.fivestars.krossplatform.model.message

import kotlinx.serialization.Serializable

@Serializable
data class JavascriptMessage(
    val action: String,
    val successCallback: String?,
    val failureCallback: String?,
    val data: Map<String, String>? = null
)