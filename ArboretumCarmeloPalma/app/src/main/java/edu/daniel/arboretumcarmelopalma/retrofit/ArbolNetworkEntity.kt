package edu.daniel.arboretumcarmelopalma.retrofit
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ArbolNetworkEntity(

    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("familia")
    @Expose
    var familia: String,

    @SerializedName("genero")
    @Expose
    var genero: String,

    @SerializedName("floracion")
    @Expose
    var floracion: String,

    @SerializedName("ubicacion")
    @Expose
    var ubicacion: String,
)

