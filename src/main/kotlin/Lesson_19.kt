fun main(){

    val person1 = Employee1("Asan", "Usen", 27, 2)
    val person2 = Employee1("Asan", "Usen", 27, 2)

    val person3 = person1.copy(surName = "Usonov")

    println(person1.toString()) //адрес памяти
    println(person1.hashCode()) //id
    println(person2.hashCode())
    println(person1 == person2)
    println(person1 == person3)
    println("person3: $person3")
}

data class Employee1(
    val name: String,
    val surName: String,
    val age: Int,
    val experience: Int){

}
