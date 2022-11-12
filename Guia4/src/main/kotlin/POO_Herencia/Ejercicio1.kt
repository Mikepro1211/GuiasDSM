import POO_Herencia.Dado
import POO_Herencia.DadoRecuadro

fun main(parametro: Array<String>) {
   val dado1 = Dado()
    dado1.tirarDado()
    dado1.imprimir()

    val dado2 = DadoRecuadro()
    dado2.tirarDado()
    dado2.tirarDadoAsterisco()
}