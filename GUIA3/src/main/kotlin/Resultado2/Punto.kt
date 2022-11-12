package Resultado2
/*Confeccionar una clase que represente un punto en el plano, la coordenada de un punto en el plano está
dada por dos valores enteros x e y. Al constructor llega la ubicación del punto en x e y. Implementar un
método que retorne un String que indique en que cuadrante se ubica dicho punto.
 1o Cuadrante si x > 0 Y y > 0,
 2o Cuadrante: x < 0 Y y > 0,
 3o Cuadrante: x < 0 Y y < 0,
 4o Cuadrante: x > 0 Y y < 0
Si alguno o los dos valores son cero luego el punto se encuentra en un eje.
Definir luego 5 objetos de la clase Punto en cada uno de los cuadrantes y uno en un eje.*/
class Punto {
    var x :Int =0
    var y : Int = 0

    fun datos(){
        println("Ingrese el valor de X")
        x = readln()!!.toInt()
        println("Ingrese el valor de Y")
        y  = readln()!!.toInt()
    }
    fun procresar(){


        when{
            x>0&&y>0 -> { println("Primer Cuadrante")
            if (x==0) println("Solo se encuentra en y primer cuadrante")else if (y==0) println("Solo " +
                    "se encuentra en X primer cuadrante")
            }
            x<0&&y>0 -> { println("Segundo Cuadrante")}
            x<0&&y<0 -> {println("Tercer Cuadrante")}
            x>0&&y<0 -> {println("Cuarto Cuadrante")}
            else -> {}

        }
    }

}