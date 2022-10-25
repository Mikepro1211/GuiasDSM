/*Hacer un programa que posea dentro de el 2 menus, teniendo en cuenta el siguiente formato*/

fun main() {
    do {
        val a = println("a) conversion de  colones a dolares")
        val b = println("b) conversion de millas a  kms")
        val c = println("c) conversion de grados Celsius a grados Fahrenheit")
        val d = println("d) segundo menu")
        val e = println("e) fin de menu")
        println("¿Que deseas hacer ahora?")
        val seleccion = readln().toString()
        val continuar = 1

        when {
            seleccion == "a" || seleccion == "A" -> {
                do {
                    println("///Bienvenido a Conversion de colones a dolares")
                    println("Ingrese cantidad de colones")
                    val colones = readln()!!.toFloat()
                    val dolar = 0.11F
                    val conversion = (colones * dolar) / 1
                    println("La conversion de $colones colones a dolares es $conversion")
                    println("¿Desea continuar?   1. si 2.no")
                    val cont = readln()!!.toInt()
                } while (cont == 1)
                println("Hasta Luego")
            }

            seleccion == "b" || seleccion == "B" -> {
                do {
                    println("Bienvenido a conversion de millas a kms")
                    println("Ingrese la cantidad de millas a covertir")
                    val millas = readln()!!.toFloat()
                    val kilometros = 1.60934F
                    val conversion = (millas * kilometros) / 1
                    println("La conversion de $millas millas a kms es $conversion")
                    println("¿Deseas continuar? 1. si  2.no")
                    val cont = readln()!!.toInt()
                } while (cont == 1)
                println("Hasta Luego")
            }

            (seleccion == "c" || seleccion == "C") -> {
                do {
                    println("Bienvenido a conversion de Celsius a Fahrenheit")
                    println("Ingrese Celsius")
                    val Celsius = readln()!!.toFloat()
                    val conversion = (Celsius * 1.8) + 32
                    println("La conversion de $Celsius celsius a Fahrenheit es $conversion")
                    println("¿Deseas continuar? 1. si  2.no")
                    val cont = readln()!!.toInt()
                } while (cont == 1)
                println("Hasta Luego")
            }

            (seleccion == "d" || seleccion == "D") -> {
                do {
                    println("1 .Si es positivo")
                    println("2 .ara de un triangulo ")
                    println("3 .fin submenu")
                    println("¿Que deseas hacer ahora?")
                    val miniopcion = readln()!!.toInt()
                    when {
                        miniopcion == 1 -> {
                            do {
                                println("Ingrese un numero")
                                val numero = readln()!!.toInt()
                                if (numero < 0) println("Numero negativo") else println("Numero positivo")
                                println("¿Deseas continuar? 1. si  2.no")
                                val cont = readln()!!.toInt()
                            } while (cont == 1)
                            println("Hasta luego")
                        }

                        miniopcion == 2 -> {
                            do {
                                println("Bienvenido  a calculo de area")
                                println("Ingrese  base ")
                                val base = readln().toFloat()
                                println("Ingrese altura")
                                val altura = readln().toFloat()
                                val area = (base * altura) / 2
                                println("El area del tringualo es $area")
                                println("¿Deseas continuar? 1. si  2.no")
                                val cont = readln()!!.toInt()
                            } while (cont == 1)
                        }

                        miniopcion == 3 -> {
                            println("Hasta luego")
                        }

                        else -> {
                            println("Ingrese una opcion valida")
                        }
                    }
                    println("¿Deseas continuar? 1. si  2.no")
                    val cont = readln()!!.toInt()
                } while (cont == 1)
            }
            (seleccion == "e" || seleccion == "E") ->  {
                println("Hasta Luego")
            }
            else -> {
                println("Ingrese una opcion valida")
            }
        }
        println("¿Deseas continuar? 1. si  2.no")
        val cont = readln()!!.toInt()

    } while (cont == 1)
    println("Hasta luego")
}
