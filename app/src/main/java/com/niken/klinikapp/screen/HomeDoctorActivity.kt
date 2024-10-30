package com.niken.klinikapp.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niken.klinikapp.R
import com.niken.klinikapp.adapter.AdapterMenuDoctor
import com.niken.klinikapp.adapter.AdapterMenuIcon
import com.niken.klinikapp.model.MockList
import com.niken.klinikapp.model.MockList2
import com.niken.klinikapp.model.ModelListDoctor
import com.niken.klinikapp.model.ModelMenuIcon

class HomeDoctorActivity : AppCompatActivity(){
    private lateinit var rv_icon : RecyclerView
    private lateinit var rv_dokter : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctor)

        rv_icon = findViewById(R.id.rv_menu_icon)
        rv_dokter = findViewById(R.id.rv_doctor)

        ///recyle view icon
        rv_icon.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val adapter1 = AdapterMenuIcon(MockList.getModel() as ArrayList<ModelMenuIcon>,this)
        rv_icon.adapter = adapter1

        rv_icon.layoutManager?.scrollToPosition(0)

        //recycle view dokter
        rv_dokter.layoutManager = GridLayoutManager(this, 1)
        val adapter2 = AdapterMenuDoctor(MockList2.getModel() as ArrayList<ModelListDoctor>, this)
        rv_dokter.adapter = adapter2

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}