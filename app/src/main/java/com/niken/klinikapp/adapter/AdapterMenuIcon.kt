package com.niken.klinikapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.niken.klinikapp.R
import com.niken.klinikapp.model.ModelMenuIcon
import com.niken.klinikapp.screen.HomeDoctorActivity

class AdapterMenuIcon (
    val itemMenuList : List<ModelMenuIcon>,
    val getActivity : HomeDoctorActivity
) : RecyclerView.Adapter<AdapterMenuIcon.MyViewHolder>() {
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)  {
        var itemImage : ImageView
        var itemJudul : TextView

        init {
            itemImage =itemView.findViewById(R.id.imgIcon) as ImageView
            itemJudul =itemView.findViewById(R.id.txtMenu) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menuicon, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemMenuList[position].imgMenu)
        holder.itemJudul.setText(itemMenuList[position].namaMenu)
    }
}