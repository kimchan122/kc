package com.example.kc

import android.animation.ObjectAnimator
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var logo: ImageView=findViewById(R.id.Logo)
        var logotext: TextView=findViewById(R.id.Logotext)
        var name: TextView=findViewById(R.id.name)

        val fadeOut = ObjectAnimator.ofFloat(logo, "alpha", 0f, 1f)
        val fadeOut1 = ObjectAnimator.ofFloat(logotext, "alpha", 0f, 1f)
        val fadeOut2 = ObjectAnimator.ofFloat(name, "alpha", 0f, 1f)

        fadeOut.duration = 3000
        fadeOut1.duration = 3000
        fadeOut2.duration = 3000

        fadeOut.start()
        fadeOut1.start()
        fadeOut2.start()

        Handler().postDelayed({
            val Intent = Intent(this, Main2Activity::class.java)
            startActivity(Intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        },3000)

    }
}