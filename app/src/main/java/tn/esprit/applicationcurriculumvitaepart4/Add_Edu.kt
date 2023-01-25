package tn.esprit.applicationcurriculumvitaepart4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Add_Edu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edu)

        supportActionBar!!.title="Add Experience"
    }
}