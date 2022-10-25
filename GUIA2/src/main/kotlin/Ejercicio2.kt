fun main() {
    //Cree un programa que pida 3 números al usuario y determine cuál de ellos es el menor.
    println("Ingrese Primer Digito")
    var num1 = readln()!!.toInt()
    println("Ingrese segundo Digito")
    var num2 = readln()!!.toInt()
    println("Ingrese tercer digito")
    var num3= readln()!!.toInt()

    if(num1 <num2 && num1<num3) {
        println("El numero menor es $num1 que $num2 y que $num3")
    }else if(num2<num1 && num2<num3){
        println("El numero menor es $num2 que $num1  y que $num3")
    }else println("El numero menor es $num3  que $num1 y que $num2")
}
