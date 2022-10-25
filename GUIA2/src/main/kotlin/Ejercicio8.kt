import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println("Ingrese su edad en orden (dd/MM/yyyy):")
    val fechaNacimientoString= readLine()
    lateinit var fechaNacimientoDate:Date
    try {
        fechaNacimientoDate=SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoString)
    }
    catch (e:Exception){
        println("Porfavor esa no es una fecha de nacimiento correcta asegurese de seguir el orden dd/mm/yyyy $e")
    }
    val fechaActual=Date(System.currentTimeMillis())
    val diferenciaFechaMilisegundos=fechaActual.getTime()-fechaNacimientoDate.getTime()
    val segundos=diferenciaFechaMilisegundos/1000

    val minutos=segundos/60
    val horas=minutos/60
    val dias=horas/24
    val años=dias/365
    println("Su edad es de tienes $años")
}