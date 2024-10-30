package com.niken.klinikapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.niken.klinikapp.Detail
import com.niken.klinikapp.R
import com.niken.klinikapp.model.ModelListDoctor
import com.niken.klinikapp.screen.HomeDoctorActivity

class AdapterMenuDoctor (
    val itemList: ArrayList<ModelListDoctor>,
    val getActivity: HomeDoctorActivity
):RecyclerView.Adapter<AdapterMenuDoctor.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var itemGambar : ImageView
        var itemNama : TextView
        var itemSpes : TextView
        var itemReview : TextView
        var itemRating : TextView

        init {
            itemGambar = itemView.findViewById(R.id.imgDoctor) as ImageView
            itemNama = itemView.findViewById(R.id.txtNamaDoctor) as TextView
            itemSpes = itemView.findViewById(R.id.txtSpesDoctor) as TextView
            itemReview = itemView.findViewById(R.id.txtReviewDoctor) as TextView
            itemRating = itemView.findViewById(R.id.txtJumlahRating) as TextView
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listdoctor, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemGambar.setImageResource(itemList[position].imgDoctor)
        holder.itemNama.setText(itemList[position].namaDoctor)
        holder.itemSpes.setText(itemList[position].SpesDoctor)
        holder.itemReview.setText(itemList[position].jumlahRiview)
        holder.itemRating.setText(itemList[position].angkaRating)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity,Detail::class.java)

            intent.putExtra("gambar",itemList[position].imgDoctor)
            intent.putExtra("nama_dokter",itemList[position].namaDoctor)
            intent.putExtra("spesialis",itemList[position].SpesDoctor)
            intent.putExtra("review",itemList[position].jumlahRiview)
            intent.putExtra("nilai",itemList[position].angkaRating)

            getActivity.startActivity(intent)
        }

    }

}
