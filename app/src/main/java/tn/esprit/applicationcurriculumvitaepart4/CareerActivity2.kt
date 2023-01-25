package tn.esprit.applicationcurriculumvitaepart4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_career.*

class CareerActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career2)



        recyclerView  = findViewById(R.id.recyclerView2)
        //Log.d(recyclerView.toString(),"merci");
        val users = ArrayList<data2>()
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))
        users.add(data2("01/09/2022","TODAY", "MASSACHUSETTS","UNITED STATES",R.drawable.ic_logo_massachusetts))
        users.add(data2(" 01/09/2018","31/08/2020", "OXFORD","UNITED KINGDOM",R.drawable.ic_logo_oxford))


        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val adapter = CustomAdapter2(users)
        recyclerView.adapter = adapter


    }
}