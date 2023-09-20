package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarian

class DoaAdapter (val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder (view: View):RecyclerView.ViewHolder(view){
        val tvjuduldoa:TextView=view.findViewById(R.id.tvjuduldoa)
        val tvtextarab:TextView=view.findViewById(R.id.tvdoaarab)
        val tvtextlatin:TextView=view.findViewById(R.id.tvdoalatin)
        val ibcollapse:ImageButton=view.findViewById(R.id.ibcollapse)
        val rlisidoa:RelativeLayout=view.findViewById(R.id.rlisidoa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian, parent,false)
        return DoaHarianViewHolder(view)
    }

    override fun getItemCount(): Int{
        return data.size
    }

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item=data.get(position)
        holder.tvjuduldoa.text=item.judul
        holder.tvtextarab.text=item.textarab
        holder.tvtextlatin.text=item.textlatin

        holder.ibcollapse.setOnClickListener{

            if(holder.rlisidoa.visibility==View.GONE){
                holder.rlisidoa.visibility=View.VISIBLE
                holder.ibcollapse.setBackgroundResource(com.google.android.material.R.drawable.ic_arrow_back_black_24)
            }else{
                holder.rlisidoa.visibility=View.GONE
                holder.ibcollapse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
            }
        }

    }


}