
fun main(){

    val max = getMax(5,6)
    val max2 = getMax(5,6,7)
    val max1 = getMax(5.0,6.0)
    println(max)
    println(max1)
    println(max2)
    sayHello()

    printInts(1,2)

}

fun printInts(vararg ints: Int){
    for (i in ints) println(i)
}

fun getMax(num1: Int, num2: Int): Int{

    return if(num1 > num1) num1 else num2
}
fun getMax(num1: Int, num2: Int, num3: Int): Int{

    return  when{
        num1> num2 && num1>num3 ->num1
        num2> num1 && num2>num3 ->num2
        else -> num3
    }
}
fun getMax(num1: Double, num2: Double):Double{

    return if(num1 > num1) num1 else num2
}

fun sayHello(name: String = "Kotlin", reps: Int = 1){

    var counter = reps

    while (counter> 0){
        println("Hello $name! Where are you?")
        counter--
    }


}