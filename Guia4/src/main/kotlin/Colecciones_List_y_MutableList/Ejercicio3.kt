package Colecciones_List_y_MutableList

//3-Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.
//- Definir una lista mutable con tres empleados.
//- Imprimir los datos de los empleados.
//- Calcular cuánto gasta la empresa en sueldos.
//Agregar un nuevo empleado a la lista y calcular nuevamente el gasto en sueldos.

data class Empleado(var nombre: String, var sueldo: Double) //constructor

    val empleados: ArrayList<Empleado>  = arrayListOf()

    fun inicializar(){
        empleados.add(Empleado("Jared", 2750.0))
        empleados.add(Empleado("Nahomy", 1650.0))
        empleados.add(Empleado("Kevin", 850.0))

        //Imprime los datos de los empleados
        listaEmpleados(empleados)

        //Imprime el gato en sueldos de la empresa
        println("-> El gasto total de sueldos de la empresa es de: $${gastoSueldo(empleados)} \n")

        //Agregamos nuevo empleado
        empleados.add(Empleado("Javier", 1750.0))
        listaEmpleados(empleados)

        //Imprimimos el nuevo gasto en sueldos de la empresa
        println("-> El gasto total de sueldos de la empresa es de: $${gastoSueldo(empleados)} ")
    }

    fun listaEmpleados(empleados: ArrayList<Empleado>){
        for (empleado in empleados){
            println("Nombre: ${empleado.nombre} \t Sueldo: ${empleado.sueldo}")
        }
    }

    fun gastoSueldo(empleados: ArrayList<Empleado>): Double{
        var sueldos: Double = 0.0
        for (empleado in empleados){
            sueldos += empleado.sueldo
        }
        return sueldos
    }


fun main(args: Array<String>){
    inicializar()
}