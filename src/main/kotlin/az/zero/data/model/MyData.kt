package az.zero.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MyData(
    val data: List<Rabbit>
) : BaseResponse()
