package Colecciones_Map_MutableMap

//5-Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:
//data class Fecha(val dia: Int, val mes: Int, val año: Int)
//Como valor en el mapa almacenar un String. Implementar las siguientes funciones:
//1) Carga de datos en la agenda.
//2) Listado completo de la agenda.
//3) Consulta de una fecha.

data class Fecha(val dia: Int, val mes: Int, val annio: Int){
    override fun toString(): String  = "Fecha: $dia/$mes/$annio"
}

class Agenda{
    var agenda: MutableMap<Fecha, String> = mutableMapOf()

    fun inicializar(){
        var salir: Boolean = false
        var opcion: String = ""

        do{
            println("\nMenu agenda\n")
            println("1- cargar datos")
            println("2- Listar agenda")
            println("3- Consultar")
            println("0- Salir")

            opcion = readln().toString()

            when(opcion){
                "1" -> cargarDatos(agenda)
                "2" -> listarAgenda(agenda)
                "3" -> consultar(agenda)
                "0" -> salir = true
            }
        }while (!salir)
    }

    fun cargarDatos(agenda: MutableMap<Fecha, String>){
        print("Introduzca la fecha DD MM AAAA : ")
        val (dia, mes, anio) = readln().toString().split(" ")

        print("\n\nIntroduzca la nota: ")
        val texto: String = readln().toString()

        agenda.put(Fecha(dia.toInt(), mes.toInt(), anio.toInt()), texto)
    }

    fun listarAgenda(agenda: MutableMap<Fecha, String>){
        println(agenda)
    }

    fun consultar(agenda: MutableMap<Fecha, String>){
        print("Introduzca la fecha DD MM AAAA : ")
        val (dia, mes, anio) = readLine().toString().split(" ")
        println(agenda.get(Fecha(dia.toInt(), mes.toInt(), anio.toInt())))
    }
}

fun main(args: Array<String>){
    val agenda1 = Agenda()
    agenda1.inicializar()
}