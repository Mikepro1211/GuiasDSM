package sv.edu.udb.guia8

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val  btnActualizar = findViewById<Button>(R.id.btnActualizar)
        val  btnMostrar =  findViewById<Button>(R.id.btnMostrar)
        val  btnEliminar = findViewById<Button>(R.id.btnEliminar)
        val nombre  = findViewById<EditText>(R.id.etNombre)
        val apellido  = findViewById<EditText>(R.id.etApellido)
        val edad =  findViewById<EditText>(R.id.etEdad)
        val numero =  findViewById<EditText>(R.id.editTextPhone)

        btnIngresar.setOnClickListener {
            val admin= AdminSQLiteOpenHelper(this,"datos",null,1)
            val bd =admin.writableDatabase
            val registro =  ContentValues()
            registro.put("nombre",nombre.getText().toString())
            registro.put("apellido",apellido.getText().toString())
            registro.put("edad",edad.getText().toString())
            registro.put("telefono",numero.getText().toString())
            bd.close()
            nombre.setText("")
            apellido.setText("")
            edad.setText("")
            numero.setText("")
            Toast.makeText(this,"Se cargaron los datos ${nombre.getText().toString()}",Toast.LENGTH_LONG).show()
        }
        btnMostrar.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this,"datos",null,1)
            val bd = admin.writableDatabase
            val fila = bd.rawQuery("select apellido,edad,telefono from persona where nombre=${nombre.text.toString()}",null)
            if (fila.moveToFirst()){
                apellido.setText(fila.getString(0))
                edad.setText(fila.getString(1))
                numero.setText(fila.getString(2))
            }else{
                Toast.makeText(this,"No existe Nombre en la base de datos",Toast.LENGTH_LONG).show()
                    bd.close()
            }
        }
        btnEliminar.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this,"datos",null,1)
            val db =  admin.writableDatabase
            val cant= db.delete("persona","nombre=${nombre.text.toString()}",null)
            db.close()
            nombre.setText("")
            apellido.setText("")
            edad.setText("")
            numero.setText("")
            if (cant ==1){
                Toast.makeText(this,"Se borro la informacion",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"no existe informacion",Toast.LENGTH_LONG).show()
            }
        }
        btnActualizar.setOnClickListener {
            val admin =  AdminSQLiteOpenHelper(this,"datos",null,1)
            val db = admin.writableDatabase
            val registro =ContentValues()
            registro.put("apellido",apellido.text.toString())
            registro.put("edad",edad.text.toString())
            registro.put("telefono",numero.text.toString())
            val cant = db.update("persona",registro,"nombre=${nombre.text.toString()}",null)
            db.close()
            if (cant==1){
                Toast.makeText(this,"Se actualizo la informacion",Toast.LENGTH_LONG).show()
            }else
                Toast.makeText(this,"no existe para actualizar la informacion",Toast.LENGTH_LONG).show()

        }
    }

}