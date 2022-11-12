package sv.edu.udb.guia8
import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
class AdminSQLiteOpenHelper (context: Context, name:String,factory: CursorFactory?,version: Int):SQLiteOpenHelper(context,name,factory,version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table persona(nombre text,apellido text,edad Int,telefono Int)")
        //nombre , apellido  , edad ,telefono

    }

    override fun onUpgrade(db: SQLiteDatabase,oldVersion: Int, newVersion: Int) {

    }
}