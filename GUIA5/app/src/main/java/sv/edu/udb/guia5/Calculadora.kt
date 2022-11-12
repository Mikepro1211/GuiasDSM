package sv.edu.udb.guia5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val button = findViewById<Button>(R.id.button)
        val btnregresar = findViewById<Button>(R.id.btnRegresar)
        val lista= arrayOf("Suma","Restar","Multiplicar","Dividir")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,lista)
        spinner.adapter =adaptador1
        button.setOnClickListener {
            when(spinner.selectedItem.toString()){
                "Suma" -> tv1.text = "Resultado : ${et1.text.toString().toDouble() +et2.text.toString().toDouble()}"
                "Restar"-> tv1.text ="Resultado : ${et1.text.toString().toFloat() -et2.text.toString().toDouble()}"
                "Multiplicar" ->tv1.text="Resultado: ${et1.text.toString().toDouble() * et2.text.toString().toDouble()}"
                "Dividir"->tv1.text ="Resultado : ${et1.text.toString().toDouble() / et2.text.toString().toDouble()}"

            }
        }
        btnregresar.setOnClickListener {
            finish()
        }
    }
}