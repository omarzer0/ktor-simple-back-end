package az.zero.data.model

import kotlinx.serialization.Serializable

@Serializable
open class BaseResponse(
    var key: String = "",
    var msg: String? = "",
    var code: Int? = 200
)