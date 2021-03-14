fun main(){
    getVklad(100.0,10.0, 3.0)

}

fun getVklad(sum:Double,p:Double, y:Double) {
    println(sum * (Math.pow((1+p/100),y)))

}


