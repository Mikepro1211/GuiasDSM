/*Hacer un programa con un menú que pase de Kg a otra unidad de medida de masa, mostrar en
pantalla un menú con las opciones posibles.
Menú:
1. Kg a libras
2. Kg a onzas
3. Kg a toneladas*/

fun main(parametro:Array<String>) {

    do {
        println("Bienvenido al convertido")
        println("1. Kg a Libras")
        println("2. kg a onzas")
        println("3. kg a toneladas")
        println("Seleccione una opcion")
        val menu = readln()!!.toInt()

        when {
            menu == 1 -> {
                println("/////Kg a Libras/////")
                println("Ingrese kilogramos")
                val kg = readln()!!.toFloat()
                val lb = 2.20462f
                val conversion = (kg * lb) / 1
                println("La conversion de $kg kilogramos a libras es $conversion")

            }

            menu == 2 -> {
                println("/////Kg a onzas/////")
                println("Ingrese kilogramos")
                val kg = readln()!!.toFloat()
                val onzas = 35.274f
                val conversion = (kg * onzas) / 1
                println("La conversion de $kg kilogramos a onzas es $conversion")
            }

            menu == 3 -> {
                println("/////Kg a tonelads/////")
                println("Ingrese kilogramos")
                val kg = readln()!!.toFloat()
                val toneladas = 0.001f
                val conversion = (kg * toneladas) / 1
                println("La conversion de $kg kilogramos a toneladas es $conversion")
            }

            else -> {
                println("Ingrese una opcion valida")
            }

        }
        println("¿Desea continuar  (1. Si ) (2.No)")
        val continuar = readln()!!.toInt()
    }while(continuar==1)
    println("Hasta luego")
}