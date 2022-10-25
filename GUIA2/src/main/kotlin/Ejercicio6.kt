/*Crear un programa que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado. Formulas:*/
/*Equilátero: Perímetro = 3 * lado1
Isósceles: Perímetro = (2*lado1) + base
Rectángulo: Perímetro = lado1 + lado2 + (raizcuadrada[ (lado1)2 + (lado2)2
] )*/

fun main() {

    do {
        println("Bienvenido")
        println("1. Equilatero")
        println("2. Isoceles")
        println("3. Escaleno")
        println("Ingrese una opcion")
        val opciones = readln()!!.toInt()

        when {
            opciones == 1 -> {
                println("////////Perimetro de Triangulo Equilatero////////")
                println("Ingrese el lado")
                val lado1 = readln()!!.toInt()
                val equilatero = 3 * lado1
                println("El perimetro del equilatero es $equilatero")
            }

            opciones == 2 -> {
                println("////////Perimetro de Triangulo Isósceles////////")
                println("Ingrese el lado")
                val lado1 = readln()!!.toInt()
                println("Ingrese base")
                val base = readln()!!.toInt()
                val iso = (2 * lado1) + base
                println("El perimetro del Isoceles es $iso")
            }

            opciones == 3 -> {
                println("////////Perimetro de Triangulo Escaleno////////")
                println("Ingrese lado 1")
                val lado1 = readln()!!.toInt()
                println("Ingrese lado 2")
                val lado2 = readln()!!.toInt()
                //Rectángulo: Perímetro = lado1 + lado2 + (raizcuadrada[ (lado1)2 + (lado2)2
                val escaleno = (lado1+lado2 + Math.sqrt(Math.pow(lado1.toDouble(), 2.0)+ Math.pow(lado2.toDouble(),2.0)))
                println("El perimetro del escaleno es $escaleno")
            }

            else -> {
                println("Ingrese una opcion valida")
            }
        }
        println("Desea Continuar y/n")
        val continuar = readln()
    }while(continuar == "y")
    println("Hasta Luego")
}