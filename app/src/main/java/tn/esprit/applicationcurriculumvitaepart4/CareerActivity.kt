package tn.esprit.applicationcurriculumvitaepart4

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.DisplayContext
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.chrono.JapaneseEra.values


class CareerActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)
        btn1 = findViewById(R.id.b1)
        btn2 = findViewById(R.id.b2)


        btn2.setOnClickListener(){
            val i = Intent(this, CareerActivity2::class.java)
            startActivity(i)
        }


        recyclerView  = findViewById(R.id.recyclerView)
        Log.d(recyclerView.toString(),"merci");
        val users = ArrayList<data>()
        users.add(data("sasasas","sasas", "aze aze azed zazedf dzed dz ddz edfdz dfd ",R.drawable.ic_logo_esprit))
        users.add(data(" mlsusns","ldldldld", "kj kj kj kj kj kj   o oi j  ljhedefjdv eudhed", R.drawable.ic_logo_amazon))
        users.add(data("sasasas","sasas", "aze aze azed zazedf dzed dz ddz edfdz dfd ",R.drawable.ic_logo_esprit))
        users.add(data(" mlsusns","ldldldld", "kj kj kj kj kj kj   o oi j  ljhedefjdv eudhed", R.drawable.ic_logo_amazon))
        users.add(data("sasasas","sasas", "aze aze azed zazedf dzed dz ddz edfdz dfd ",R.drawable.ic_logo_esprit))
        users.add(data(" mlsusns","ldldldld", "kj kj kj kj kj kj   o oi j  ljhedefjdv eudhed", R.drawable.ic_logo_amazon))
        users.add(data("sasasas","sasas", "aze aze azed zazedf dzed dz ddz edfdz dfd ",R.drawable.ic_logo_esprit))
        users.add(data(" mlsusns","ldldldld", "kj kj kj kj kj kj   o oi j  ljhedefjdv eudhed", R.drawable.ic_logo_amazon))

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter







    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.icon_more,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.expe -> {
                val i = Intent(this@CareerActivity, Add_exp::class.java)
                startActivity(i)
            }
            R.id.educ -> {
                val i = Intent(this@CareerActivity, Add_Edu::class.java)
                startActivity(i)
            }

        }

        return true
    }






}





