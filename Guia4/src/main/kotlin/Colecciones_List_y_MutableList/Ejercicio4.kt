package Colecciones_List_y_MutableList

//Cargar por teclado y almacenar en una lista inmutable las alturas de 5 personas (valores Float)
//Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.

fun main(args: Array<String>){
    var personas: List<Float> = listOf(181f, 190f, 178f, 156f, 183f)

    //promedio de las alturas
    var total: Float = 0f
    println("Las alturas son: ")
    personas.forEach(){
        println(" $it" + "cm")
        total += it
    }
    println("-> El promedio de las alturas es de: ${total / 5}")

    //cantidad de personas mas Altas
    var pmasAltas: Int = 0
    personas.forEach(){
        if (it > total / 5 )
            pmasAltas ++
    }
    println("La cantidad de personas mas Altas al promedio es: $pmasAltas")

    //Cantidad de personas mas Bajas
    var pmasBajas: Int = 0
    personas.forEach(){
        if (it < total / 5)
            pmasBajas ++
    }
    println("La cantidad de personas mas Bajas al promedio es: $pmasBajas")
}