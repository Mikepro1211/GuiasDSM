package POO_Herencia

open class Dado {
    var valor: Int = 1

    fun tirarDado(){
        valor = (Math.random() * 6 + 1).toInt()
    }

    fun imprimir(){
        println("\n$valor\n")
    }
}
