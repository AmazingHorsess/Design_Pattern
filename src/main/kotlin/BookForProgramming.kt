open class BookForProgramming (
    val bookName: String,
    val bookCountOfPage: Int,
    val bookPrice: Double,

){


    open fun calculateQuality(): Double{
        return (bookPrice/bookCountOfPage)
    }

    open fun printInfo(){
        println("Информация о книге")
        println("Название  $bookName")
        println("Количество Страниц $bookCountOfPage")
        println("Цена ${bookPrice}")
        println("Качество Q ${calculateQuality()}")
    }

}

class UpgradedBookForProgramming(
    bookName: String,
    bookCountOfPage: Int,
    bookPrice: Double,
    val yearCurrent: Int,
    val yearOfEdition: Int
): BookForProgramming(bookName, bookCountOfPage, bookPrice){
    override fun calculateQuality(): Double {
        val q = super.calculateQuality()
        return q - 0.2 * (yearCurrent-yearOfEdition)

    }




}

fun main(){
    val book1 = BookForProgramming("Грокаем Алгоритмы ",325,4000.0)
    val book2 = UpgradedBookForProgramming("Чистая архитектура Боб Мартин", 432, 6250.0, 2023,2014)

    println("Книга 1:")
    book1.printInfo()
    println()
    println("Книга 2:")
    book2.printInfo()

    //Книга 1:
    //Информация о книге
    //Название  Грокаем Алгоритмы
    //Количество Страниц 325
    //Цена 4000.0
    //Качество Q 12.307692307692308
    //
    //Книга 2:
    //Информация о книге
    //Название  Чистая архитектура Боб Мартин
    //Количество Страниц 432
    //Цена 6250.0
    //Качество Q 12.667592592592593





}