fun main() {
    //Cree un programa que pida 3 números al usuario y determine cuál de ellos es el mayor.
    println ("Ingrese Primer digito")
    var num1 = readln()!!.toInt()
    println ("Ingrese segundo digito ")
    val num2 = readln()!!.toInt()
    println("Ingrese tercer digito")
    val num3 = readln()!!.toInt()

    if(num1 > num2 &&num1>num3) {
        println("El numero $num1 es mayor que $num2 y que $num3")
    }else if (num2 > num1 && num2> num3)
        println("El numero  $num2 es mayor que $num1 y que $num3")
    else{
        print("El numero $num3 es mayor que $num1 y que $num2" )
    }
}