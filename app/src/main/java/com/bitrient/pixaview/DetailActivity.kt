package com.bitrient.pixaview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bitrient.pixaview.models.Photo
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val photo = intent.getSerializableExtra(PHOTO) as Photo?
        photo?.webformatURL.let {
            Glide.with(this).load(photo?.webformatURL)
                    .into(imageView)
        }

        imageView.setOnClickListener {
            finish()
        }
    }

    companion object {
        val PHOTO = "PHOTO"
    }
}
