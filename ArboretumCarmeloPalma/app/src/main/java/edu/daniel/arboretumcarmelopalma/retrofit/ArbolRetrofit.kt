package edu.daniel.arboretumcarmelopalma.retrofit

import retrofit2.http.GET
interface ArbolRetrofit {
    @GET("arbol/?limit=100")
    suspend fun get_arbol(): List<ArbolNetworkEntity>
}
