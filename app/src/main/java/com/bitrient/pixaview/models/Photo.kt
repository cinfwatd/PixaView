package com.bitrient.pixaview.models

import java.io.Serializable

/**
 * Created by czprobity on 13/07/2017.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewURL: String,
                 val webformatURL: String) : Serializable {
}