//Crear un programa que pida tres números e indicar si el tercero es igual a la suma del primero y el
//segundo
// .
fun main() {
    println("Ingrese primer digito")
    val num1 = readln()!!.toInt()
    println("Ingrese segundo digito")
    val num2 = readln()!!.toInt()
    println("Ingrese tercer digito")
    val num3 = readln()!!.toInt()
    if(num1+num2==num3){
        val resultado = num1+num2
        println("La suma de $num1 + $num2 es $resultado es igual al tercer digito = $num3")
    }else{
        val  resultado = num1+num2
        println("la suma de $num1 + $num2 es $resultado no es igual al tercer digito $num3 ")

    }
}