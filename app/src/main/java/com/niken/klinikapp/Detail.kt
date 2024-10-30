package com.niken.klinikapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail : AppCompatActivity() {
    private lateinit var imgDoctor2: ImageView
    private lateinit var nameDoctor: TextView
    private lateinit var bidangDoctor : TextView
    private lateinit var totalReview : TextView
    private lateinit var angkaReview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        imgDoctor2 = findViewById(R.id.imgDoctor2)
        nameDoctor = findViewById(R.id.nameDoctor)
        bidangDoctor = findViewById(R.id.bidangDoctor)
        totalReview = findViewById(R.id.totalReview)
        angkaReview = findViewById(R.id.angkaReview)

        val detailImg = intent.getIntExtra("gambar",0)
        val detailNama = intent.getStringExtra("nama_dokter")
        val detailSpesialis = intent.getStringExtra("spesialis")
        val detailReview = intent.getStringExtra("review")
        val detailNilai = intent.getStringExtra("nilai")

        imgDoctor2.setImageResource(detailImg)
        nameDoctor.setText(detailNama)
        bidangDoctor.setText(detailSpesialis)
        totalReview.setText(detailReview)
        angkaReview.setText(detailNilai)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}