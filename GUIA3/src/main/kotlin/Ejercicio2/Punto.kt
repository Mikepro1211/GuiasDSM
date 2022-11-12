package Ejercicio2

class Punto {
    var x : Int = 0
    var y : Int = 0

    fun ingresarPuntos(){
        print("Ingresar el Eje x: ")
        x = readln().toInt()
        print("Ingrese el eje y: ")
        y = readln().toInt()
    }

    fun cicloPuntos(){
        for (i in 1..4){
            ingresarPuntos()
            validacion()
        }
    }

    fun validacion(){
        if(x == 0 && y != 0)
            println("El punto se encuentra en (0 , $y) \n")
        else if(x != 0 && y == 0)
            println("El punto se encuentra en ($x , 0) \n")
        else if(x == 0 && y == 0)
            println("El punto se encuentra en (0 , 0) \n")
        else
            cuadrantre()
    }

    fun cuadrantre(){
        if(x > 0 && y > 0)
            println("-- El punto se encuentra en el primer cuadrante\n")
        else if(x < 0 && y > 0)
            println("-- El punto se encuentra en el segundo cuadrante\n")
        else if(x < 0 && y < 0)
            println("-- El punto se encuentra en el tercer cuadrante\n")
        else if(x > 0 && y < 0)
            println("-- El punto se encuentra en el cuarto cuadrante\n")
    }
}
