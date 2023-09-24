open class Car(
    val carName:String,
    var carMaxSpeed: Int
) {
    open fun calculateCarPrice(): Int{
        return carMaxSpeed * 100
    }

    open fun upgradeCarModel() {
        carMaxSpeed+=10
    }

   open fun printInfo(){
        println("Информация о машине")
        println("Название машины: $carName")
        println("Макс скорость машина: $carMaxSpeed")
        println("Стоимость автомобиля: ${calculateCarPrice()}")

   }
}
class ExecutiveCar(
    carName: String,
    carMaxSpeed: Int,

):Car(carName, carMaxSpeed){
    override fun calculateCarPrice(): Int {
        return carMaxSpeed * 250
    }

    override fun upgradeCarModel() {
        carMaxSpeed +=5
    }

}

fun main(){
    val car1 = Car("Subaru Legacy 1996г.",180)
    val car2 = ExecutiveCar("BMW X7",280)

    println("Машина 1")
    car1.printInfo()
    println()
    println("Характеристики после улучшения")
    car1.upgradeCarModel()
    car1.printInfo()

    println()

    println("Машина 2")
    car2.printInfo()
    println()
    println("Характеристики после улучшения")
    car2.upgradeCarModel()
    car2.printInfo()

    //Машина 1
    //Информация о машине
    //Название машины: Subaru Legacy 1996г.
    //Макс скорость машина: 180
    //Стоимость автомобиля: 18000
    //
    //Характеристики после улучшения
    //Информация о машине
    //Название машины: Subaru Legacy 1996г.
    //Макс скорость машина: 190
    //Стоимость автомобиля: 19000
    //
    //Машина 2
    //Информация о машине
    //Название машины: BMW X7
    //Макс скорость машина: 280
    //Стоимость автомобиля: 70000
    //
    //Характеристики после улучшения
    //Информация о машине
    //Название машины: BMW X7
    //Макс скорость машина: 285
    //Стоимость автомобиля: 71250


}