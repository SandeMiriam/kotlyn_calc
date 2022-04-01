fun main(){

    println("This is a calculator,+,-,*,/")

    println("Enter first number")

    var num= readln()!!.toInt()

    println("Enter second number ")

    var num2 = readLine()!!.toInt()

    println("Enter sign")

    var sign= readLine()!!

    if(sign =="+") {
        var ans= num + num2
        kotlin.io.println("The answer is $ans")
    }
    if (sign=="-"){
        var ans= num - num2
        println("The answer is $ans")
    }

    if (sign=="*"){
        var ans= num * num2
        println("The answer is $ans")
    }

    if (sign=="/"){
        var ans =num / num2
        println("The answer is $ans")
    }



}