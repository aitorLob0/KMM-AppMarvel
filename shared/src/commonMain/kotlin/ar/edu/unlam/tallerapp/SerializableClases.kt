package ar.edu.unlam.tallerapp

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class CharactersResponse(
    @SerialName("data") val characters: CharacterData
)

@kotlinx.serialization.Serializable
data class CharacterData(
    @SerialName("results")
    val list: List<CharacterResult>
)

@kotlinx.serialization.Serializable
data class CharacterResult(
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String,
    @SerialName("thumbnail") val thumbnail: Thumbnail
)

@kotlinx.serialization.Serializable
data class Thumbnail(
    @SerialName("path") val path: String,
    @SerialName("extension") val extension: String
) {
    fun toUrl() = "$path.$extension"
}