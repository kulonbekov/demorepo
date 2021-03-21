fun main(){
    val cat = Cat("Гарфилд", 4 )
    cat.condition()

    val changeCondition = ChangeCondition("Гарфилд", 4)
    changeCondition.condition()
}

open class Cat(var name:String, var age: Int ){
    open val satietyLevel = 10
    open val waterLevel = 10

    open fun condition(){
        println("Начальный уровень: Имя: $name, возвраст: $age, начальный уровень сытости: $satietyLevel, начальный уровень воды: $waterLevel")
    }
}

class ChangeCondition (name:String,age: Int): Cat(name,age){

    override val satietyLevel = 9
    override val waterLevel = 9

    override fun condition() {
        println("После изменения: уровень: Имя: $name, возвраст: $age, начальный уровень сытости: $satietyLevel, начальный уровень воды: $waterLevel")
    }

}