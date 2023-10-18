package api

import retrofit2.http.GET

private const val API_KEY = "0924306ff4ca3c2971a983833d1c2230"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    //suspend fun fetchPhotos(): String
    suspend fun fetchPhotos(): FlickrResponse
}