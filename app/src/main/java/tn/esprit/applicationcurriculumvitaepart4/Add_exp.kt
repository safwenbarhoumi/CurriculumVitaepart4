package tn.esprit.applicationcurriculumvitaepart4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Add_exp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_exp)

        supportActionBar!!.title="Add Education"
    }
}