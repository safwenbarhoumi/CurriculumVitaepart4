package tn.esprit.applicationcurriculumvitaepart4

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnskill: Button
    private lateinit var btnhob: Button
    private lateinit var btnlang: Button
    private lateinit var btncareer : Button
    private lateinit var im : ImageView
    private var imageUri: Uri? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        // supportActionBar!!.title = "your titlebar"



        btnskill = findViewById(R.id.s1)
        btnhob = findViewById(R.id.s2)
        btnlang = findViewById(R.id.s3)
        btncareer = findViewById(R.id.btn_car)

        im = findViewById(R.id.img_save)


        im.setOnClickListener {

            openGalleryForImage()
            //onActivityResult(100, 100,data = null)
            //var bitmap = (im.drawable as BitmapDrawable).bitmap

            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            //startActivityForResult(gallery, 100)

        }



        val fskill = SkillFragment()
        val fhobbies = hobbiesfragment()
        val flanguage = LanguagesFragment()
        btnskill.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , fhobbies)
                commit()
            }
        }

        btnhob.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , fhobbies)
                addToBackStack(null)
                commit()
            }
        }

        btnlang.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , flanguage)
                addToBackStack(null)
                commit()
            }
        }



        supportFragmentManager.beginTransaction().apply() {
            replace(R.id.flfrag , flanguage)
            commit()
        }

        btncareer.setOnClickListener(){
            val i = Intent(this@MainActivity2, CareerActivity::class.java)
            startActivity(i)
        }

    }
    private fun openGalleryForImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        //startActivityForResult(intent, 100)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.your_resume , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.logout -> finish()
            R.id.home -> Toast.makeText(this , " home is worked" , Toast.LENGTH_SHORT).show()
            R.id.help -> Toast.makeText(this , " help is worked" , Toast.LENGTH_SHORT).show()

        }

        return true
    }

}