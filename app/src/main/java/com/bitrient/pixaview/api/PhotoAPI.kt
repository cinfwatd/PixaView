package com.bitrient.pixaview.api

import com.bitrient.pixaview.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by czprobity on 13/07/2017.
 */
interface PhotoAPI {
    @GET("?key=5884244-00efc26ade14df4265e31addb&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}