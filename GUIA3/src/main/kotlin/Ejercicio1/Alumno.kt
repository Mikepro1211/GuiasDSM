package Ejercicio1

class Alumno {
    var nombre: String = ""
    var nota: Float = 0f

    fun imprimir(){
        print("Ingrese su nombre: ")
        nombre = readln().toString()
        print("Ingrese su nota: ")
        nota = readln().toFloat()
    }

    fun mostrar(){
        if (nota >= 4)
            print("\n--- $nombre su nota es $nota, tienes una nota regular")
        else
            print("\n--- $nombre su nota es $nota, tienes una nota muy baja")
    }
}