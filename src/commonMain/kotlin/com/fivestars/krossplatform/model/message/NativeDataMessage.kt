package com.fivestars.krossplatform.model.message

import kotlinx.serialization.Serializable

@Serializable
class NativeDataMessage(val callback: String?, val data: String?)