package com.skh.discoverassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class ModelAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<ModelAdapter.ViewHolder>() {
    class ViewHolder (itemView:View): RecyclerView.ViewHolder(itemView){
        fun binItems(model: Model){
            itemView.text1.text=model.chairs
            itemView.item1.text=model.items
            itemView.image1.setImageResource(model.imgs)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binItems(arrayList[position])
        holder.itemView.setOnClickListener {
         if(position==0){
             Toast.makeText(
                 context,
                 "you clicked over newsfeed",
                 Toast.LENGTH_LONG
             ).show()

         }
            if(position==1){
                Toast.makeText(
                    context,
                    "you clicked over newsfeed",
                    Toast.LENGTH_LONG
                ).show()

            }
            if(position==2){
            Toast.makeText(
                context,
                "you clicked over newsfeed",
                Toast.LENGTH_LONG
            ).show()

        }
            if(position==3){
                Toast.makeText(
                    context,
                    "you clicked over newsfeed",
                    Toast.LENGTH_LONG
                ).show()

            }
            if(position==4){
                Toast.makeText(
                    context,
                    "you clicked over newsfeed",
                    Toast.LENGTH_LONG
                ).show()

            }
            if(position==5){
                Toast.makeText(
                    context,
                    "you clicked over newsfeed",
                    Toast.LENGTH_LONG
                ).show()

            }
        }
    }
}