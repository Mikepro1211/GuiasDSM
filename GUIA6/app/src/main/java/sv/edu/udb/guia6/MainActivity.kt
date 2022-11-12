package sv.edu.udb.guia6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 =findViewById<Button>(R.id.button)
        val btn2 =findViewById<Button>(R.id.button2)



        btn1.setOnClickListener {
            val intent = Intent(this,Resultado1::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this,Resultado2::class.java)
            startActivity(intent)
        }
    }
}