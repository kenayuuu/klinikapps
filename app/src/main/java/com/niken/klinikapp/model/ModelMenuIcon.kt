package com.niken.klinikapp.model

import com.niken.klinikapp.R

data class ModelMenuIcon(
    var imgMenu : Int,
    var namaMenu : String
)
object MockList{
    fun getModel() : List<ModelMenuIcon>{

        val itemModel1 = ModelMenuIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )

        val itemModel2 = ModelMenuIcon(
            R.drawable.icon_tooth,
            "Ophthalmologyst"
        )

        val itemModel3 = ModelMenuIcon(
            R.drawable.icon_eye,
            "Dentist"
        )
        val itemList : ArrayList<ModelMenuIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)


        return itemList


    }

}
