package com.example.kc

import android.Manifest
import android.animation.ObjectAnimator
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.*
import android.media.Image
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import org.w3c.dom.Text
import java.io.IOException
import java.util.*
import kotlin.math.log

class Main3Activity : AppCompatActivity() {

        private var mFusedLocationProviderClient: FusedLocationProviderClient? = null // 현재 위치를 가져오기 위한 변수
        lateinit var mLastLocation: Location // 위치 값을 가지고 있는 객체
        internal lateinit var mLocationRequest: LocationRequest // 위치 정보 요청의 매개변수를 저장하는
        private val REQUEST_PERMISSION_LOCATION = 10

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3main)

        val Intent = intent

        var Title: TextView=findViewById(R.id.title)
        var Subtitle: TextView=findViewById(R.id.subtitle)
        var Script: TextView=findViewById(R.id.script)
        var Distance: TextView=findViewById(R.id.distance)

        var youtubelink: String
        youtubelink= Intent.getStringExtra("youtube")!!

        var Youtube: YouTubePlayerView=findViewById(R.id.youtube_player_view)
        getLifecycle().addObserver(Youtube)
        Youtube.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                        val videoId = youtubelink//change according to your need
                        youTubePlayer.loadVideo(youtubelink, 0F)
                }
        })

        Title.text = Intent.getStringExtra("name")
        Subtitle.text = Intent.getStringExtra("subtitle")
        Script.text = Intent.getStringExtra("script")
        //Youtube.text = Intent.getStringExtra("youtube")

    }
}