package Colecciones_List_y_MutableList

fun main(args: Array<String>) {

    //2-Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos
    //entre 0 y 20. Contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13.
    //Imprimir si el valor 20 está presente en la lista.

    val lista: MutableList<Int> = MutableList(100) { ((Math.random() * 100)).toInt() }
    //var lista: List<Int> = listOf()
    var valores1_4: Int = 0
    var valores5_8: Int = 0
    var valores10_13: Int = 0
    var valore_20: Boolean = false

    println("Lista inmutable")
    println(lista)
    println()

    for (elemento in lista){
        when(elemento){
            in 1..4 -> valores1_4++
            in 5..8 -> valores5_8++
            in 10..13 -> valores10_13 ++
            20 -> valore_20 = true
        }
    }

    println("Numero de valores comprendidos que estan en la lista: ")
    println("--> valores del 1 al 4: $valores1_4")
    println("--> valores del 5 al 8: $valores5_8")
    println("--> valores del 10 al 13: $valores10_13 ")

    if (valore_20)
        println("El valor 20 se encuentra en la lista")
    else
        println("El valor 20 no se encuentra en la lista")





}