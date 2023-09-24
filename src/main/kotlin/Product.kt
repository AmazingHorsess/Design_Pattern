open class Product (
    val productName: String,
    val productPrice: Double,
    val productCount: Double,

){


    open fun calculateQuality(): Double{
        return (productPrice/productCount)
    }

    open fun printInfo(){
        println("Информация о товаре")
        println("Название товара $productName")
        println("Стоимость $productPrice")
        println("Количество ${productCount}e")
        println("Качество Q ${calculateQuality()}")
    }

}
//0
class UpgradedProduct(
    productName: String,
    productPrice: Double,
    productCount: Double,
    val yearOfProduct: Int,
    val yearCurrent: Int
): Product(productName, productPrice, productCount){
    override fun calculateQuality(): Double {
        var q = super.calculateQuality()
        return q + 0.5 * (yearOfProduct-yearCurrent)

    }




}

fun main(){
    val product1 = Product("Ветровка",4500.0,1000.0)
    val product2 = UpgradedProduct("Xiaomi Redmi Note 12S", 115000.0, 100.0, 2020,2023)

    println("Продукт 1:")
    product1.printInfo()
    println()
    println("Продукт 2:")
    product2.printInfo()

    //Продукт 1:
    //Информация о товаре
    //Название товара Ветровка
    //Стоимость 4500.0
    //Количество 1000.0e
    //Качество Q 4.5
    //
    //Продукт 2:
    //Информация о товаре
    //Название товара Xiaomi Redmi Note 12S
    //Стоимость 115000.0
    //Количество 100.0e
    //Качество Q 1148.5





}