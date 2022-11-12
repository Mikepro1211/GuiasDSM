package POO_Herencia

class DadoRecuadro: Dado() {

    fun tirarDadoAsterisco(){
        for (i in 1..6){
            if (valor == i){
                print("*")
                valor++
            }
        }
        println("\n")
    }
}