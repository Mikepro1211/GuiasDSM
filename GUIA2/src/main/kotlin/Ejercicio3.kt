fun main() {
    //Cree un programa que pida 2 números al usuario y determine si el primer número es múltiplo del
    //segundo.
    println("Ingrese Primer digito")
    val num1 = readln()!!.toInt()
    println("Ingrese segundo  digito")
    val num2 = readln()!!.toInt()
    val operacion = num1%num2
    if (operacion==0){

        println("$num1 es multiplo de $num2")
    }else println("$num1 no es multiplo de $num2")

}