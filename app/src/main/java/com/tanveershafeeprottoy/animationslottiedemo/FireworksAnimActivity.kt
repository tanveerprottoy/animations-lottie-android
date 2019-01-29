package com.tanveershafeeprottoy.animationslottiedemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fireworks_anim.*

class FireworksAnimActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fireworks_anim)
        activityFireworksAnimBtn.setOnClickListener(fireworkOcl)
    }

    private val fireworkOcl = View.OnClickListener {
        activityFireworksAnimLottieAnimationView.playAnimation()
    }
}
