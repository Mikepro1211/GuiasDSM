//Crear un programa que tome dos números y diga si ambos son pares o impares.
fun main() {
    println("Ingrese Primer digito")
    var num1 = readln()!!.toInt()
    println("Ingrese segundo digito")
    var num2 = readln()!!.toInt()
    var pares = num1 /2 ==0 && num2/2==0
    var impares = num1 /2 ==1 && num2/2==1

    if ((num1%2)==0 && (num2%2)==0){
        println("Los numeros $num1 y $num2 ambos son pares")
    }else if((num1%2)==1 && (num2%2)==1){
        println("Los numeros $num1 y $num2 ambos son impares")
    }else {
        println("Hay uno impar y otro  par")
    }
}