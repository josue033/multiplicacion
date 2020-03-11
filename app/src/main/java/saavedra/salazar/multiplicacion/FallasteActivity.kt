package saavedra.salazar.multiplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fallaste.*

class FallasteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fallaste)

        btnRegresar.setOnClickListener {
            val regresarIntent = Intent(this, MainActivity::class.java)
            startActivity(regresarIntent)
        }

    }
}
