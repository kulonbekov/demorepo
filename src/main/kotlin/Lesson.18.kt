fun main(){
    val person = Person("Asan", "Uson", 27)

    println(person.name)
    println(person.surName)
    println(person.age)

    person.introduceYourSelf()

    val employee = Employee("Elon", "Musk", 40, 40 )
    employee.introduceYourSelf()
}

open class Person(val name: String, val surName: String, val age: Int){

    open fun introduceYourSelf(){
        println("my Name is $name")
    }

}

class Employee(name: String, surName: String,age: Int, val experience: Int): Person(name,surName, age){

    override fun introduceYourSelf() {
        println("my name is $name $surName, i have $experience years of experience")
    }
}