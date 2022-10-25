//*Desarrollar un programa en C# que acepte las fechas escritas de modo usual y las visualice como
//números.
//Por ejemplo, la entrada: 20, agosto, 2015 debe mostrar una salida así: 20, 08, 2015.*/

fun main() {
    val con = 1
    do {
        println("Ingrese Dia")
        val dia = readln()!!.toInt()
        println(
            "Ingrese Mes " +"\n"+
                    "Ejemplo ENERO o enero"
        )
        val mes = readln()!!.toString()
        println("Ingrese año")
        val anio = readln()!!.toInt()

        when {
            (mes == "ENERO") || (mes == "enero") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 01 ")
                print(" $anio ")



            }

            (mes == "FEBRERO") || (mes == "febrero") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 02 ")
                print(" $anio ")
            }

            (mes == "MARZO") || (mes == "marzo") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 03 ")
                print(" $anio ")
            }

            (mes == "ABRIL") || (mes == "abril") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 04 ")
                print(" $anio ")
            }

            (mes == "MAYO") || (mes == "mayo") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 05 ")
                print(" $anio ")
            }

            (mes == "JUNIO") || (mes == "junio") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 06 ")
                print(" $anio ")
            }

            (mes == "JULIO") || (mes == "julio") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 07 ")
                print(" $anio ")
            }

            (mes == "AGOSTO") || (mes == "agosto") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 08 ")
                print(" $anio ")
            }

            (mes == "SEPTIEMBRE") || (mes == "septiembre") -> {
                println("Fecha Indicada")
                print(" $dia ")
                print(" 09 ")
                print(" $anio ")
            }

            (mes == "OCTUBRE") || (mes == "octubre") -> {
                println(" Fecha Indicada ")
                print(" $dia ")
                print(" 10 ")
                print(" $anio ")
            }

            (mes == "NOVIEMBRE") || (mes == "noviembre") -> {
                println(" Fecha Indicada ")
                print(" $dia ")
                print(" 11 ")
                print(" $anio ")
            }

            (mes == "DICIEMBRE") || (mes == "diciembre") -> {
                println(" Fecha Indicada ")
                print(" $dia ")
                print(" 12 ")
                print(" $anio ")
            }

            else -> {
                println("Asegurese de escribir mes en todas las letras mayusculas o minusculas")
            }
        }
        println("Seleccione una opcion " +
                "1. continuar " +
                "2. finalizar")



        val continuar = readln()!!.toInt()
    }while(continuar == con)
}
