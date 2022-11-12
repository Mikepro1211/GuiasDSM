package Ejercicio3

class Hijo {
        fun cargar(){
            val edad: IntArray
            edad = IntArray(5)

            for(i in 0..4) {
                print("Ingrese edad:")
                edad[i] = readln().toInt()
            }

            fun esMayor(){
                val max = edad.max()
                println("\nEl mayor es: $max")
            }

            fun promedio(){
                val prom = (edad.sum())/5
                println("El promedio de las edades es: $prom")
            }

            //impresion de sus elementos
            esMayor()
            promedio()
        }

}