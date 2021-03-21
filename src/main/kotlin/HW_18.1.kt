fun main(){
    val cat1 = Cat1("Kotik", 4)
    val cat2 = Cat1("Fix", 4)
    val eat = Eat("Plov", "Vtoroe blyudo")
    val paper = Paper("A4")
    val boiler = Boiler("19 litr")
    val battery = Battery("Durasel")
    val liquid = Liquid("Voda")
    val cup = Cup("Krujka")
    val box = Box("Fedex")
    val student = Student("Ivan")
    val companyMember = CompanyMember("Analitik")


    println(cat1.toString())
    println(cat1.hashCode())
    println(cat1 == cat2)

    println(eat.toString())
    println(eat.hashCode())

    println(paper.toString())
    println(paper.hashCode())

    println(boiler.toString())
    println(boiler.hashCode())

    println(battery.toString())
    println(battery.hashCode())

    println(liquid.toString())
    println(liquid.hashCode())

    println(cup.toString())
    println(cup.hashCode())

    println(box.toString())
    println(box.hashCode())

    println(student.toString())
    println(student.hashCode())

    println(companyMember.toString())
    println(companyMember.hashCode())
}
data class Cat1(val name: String, val age: Int){

}
data class Eat(val name:String, val kindOfFood: String){

}
data class Paper(val name:String){

}
data class Boiler(val name:String){

}
data class Battery(val name:String,){

}
data class Liquid(val name:String,){

}
data class Cup(val name:String,){

}
data class Box(val name:String,){

}
data class Student(val name:String,){

}
data class CompanyMember(val name:String,){

}