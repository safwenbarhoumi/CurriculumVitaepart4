package tn.esprit.applicationcurriculumvitaepart4

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (var userList : ArrayList<data>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){



    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
       var t1: TextView? = null
        var t2: TextView? = null
        var tdef: TextView? = null
        var img : ImageView? = null

        init {
            t1 = itemView.findViewById(R.id.tt1)
            t2 = itemView.findViewById(R.id.text2)
            tdef = itemView.findViewById(R.id.textView3)
            img = itemView.findViewById(R.id.t_image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data : data = userList[position]
        holder.t1!!.text= data.place1
        holder.t2!!.text = data.place2
        holder.tdef!!.text = data.def
        holder.img!!.setImageResource(data.image)

        holder.itemView.setOnClickListener {
            val i = Intent(it.context, CareerActivity::class.java)
            (it.context as MainActivity).startActivity(i)
        }


    }






}