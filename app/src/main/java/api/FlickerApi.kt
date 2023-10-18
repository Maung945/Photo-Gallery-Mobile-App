package api

import retrofit2.http.GET
import retrofit2.http.Query

//private const val API_KEY = "0924306ff4ca3c2971a983833d1c2230"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}