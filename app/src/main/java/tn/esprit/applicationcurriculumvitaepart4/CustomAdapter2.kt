package tn.esprit.applicationcurriculumvitaepart4

import android.content.Intent
import android.util.Log.i
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter2 (var userList : ArrayList<data2>):RecyclerView.Adapter<CustomAdapter2.ViewHolder>(){



    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
       var t1: TextView? = null
        var t2: TextView? = null
        var t3: TextView? = null
        var t4: TextView? = null
        var img : ImageView? = null

        init {
            t1 = itemView.findViewById(R.id.txt1)
            t2 = itemView.findViewById(R.id.txt2)
            t3 = itemView.findViewById(R.id.txt3)
            t4 = itemView.findViewById(R.id.txt4)
            img = itemView.findViewById(R.id.tt_image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview2,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data : data2= userList[position]

        holder.t1!!.text= data.place2
        holder.t2!!.text = data.place2
        holder.t3!!.text = data.place3
        holder.t4!!.text = data.place4
        holder.img!!.setImageResource(data.immage)

        holder.itemView.setOnClickListener {
            val i = Intent(it.context, CareerActivity2::class.java)
            (it.context as MainActivity).startActivity(i)
        }


    }






}