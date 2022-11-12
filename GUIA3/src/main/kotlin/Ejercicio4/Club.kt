package Ejercicio4
//nombre = String(), antiguo = IntArray(3)
class Club : Socio() {
    fun ingresoDatos(){
        for (i in 0..2){
            print("Ingrese nombre del usuario: ")
            nombre = readln().toString()
            print("Ingrese año de ingreso: ")
            antiguo[i] = readln().toInt()
        }
    }

    fun esMayor(){
        val max = antiguo.min()
        println("\nLa fecha mas antigua es: $max ")
    }
}