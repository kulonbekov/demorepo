fun main(){
    val book1 = Book("Богатый папа, бедный папа","Роберт Кийосаки", 1997, "Айрис-Пресс" )
    val book2 = Book("Квадрант денежного потока","Роберт Кийосаки", 1998, "Академия" )
    val book3 = book1.copy(name = "Почему мы хотим,чтобы вы были богаты", yearPublishing = 2000)

    println(book1.toString())
    println(book2.toString())
    println(book3.toString())

    println(book1.hashCode())
    println(book3.hashCode())
    println(book1 == book3)
}

data class Book(
    val name: String,
    val author: String,
    val yearPublishing: Int,
    val editions: String){

}