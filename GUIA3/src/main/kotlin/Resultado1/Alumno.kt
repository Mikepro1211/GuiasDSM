package Resultado1
/*Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota. Definir los
métodos para inicializar sus propiedades por teclado, imprimirlos y mostrar un mensaje si está regular
(nota mayor o igual a 4) Definir dos objetos de la clase Alumno.*/
class Alumno {
    var nombre :String  =""
    var nota :Float = 0F

    fun pedirDatos(){
        println("Ingrese su nombre")
        nombre = readln()
        println("Ingrese La nota")
        nota =  readln()!!.toFloat()
    }
    fun mostrar (){
        println("Alumno $nombre y su nota es de $nota")
    }

    fun estado(){

        if (nota>=4) println("Estado : regular") else println("Reprobado")
    }
}