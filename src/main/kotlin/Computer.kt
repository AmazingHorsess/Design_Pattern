open class Computer (
    val processorName: String,
    val processorClockSpeed: Double,
    val memorySize: Int
){
    open fun calculateQuality(): Double{
        return (0.1 * processorClockSpeed)+ memorySize
    }

    open fun printInfo(){
        println("Информация о компьютере")
        println("Процессор $processorName")
        println("Тактовая частота процессора $processorClockSpeed")
        println("Качество Q ${calculateQuality()}")
    }

}
//0
class UpgradedComputer(
    processorName: String,
    processorClockSpeed: Double,
    memorySize: Int,
    val hardDriveSize: Int
): Computer(processorName,processorClockSpeed,memorySize){

    override fun calculateQuality(): Double {
        val q =super.calculateQuality()
        return q + (0.5 * hardDriveSize)
    }

    override fun printInfo() {
        super.printInfo()
        println("Размер жесткого диска $hardDriveSize")
        println("Качесвто Qp: ${calculateQuality()}")
    }
}

fun main(){
    val computer1 = Computer("Intel Core i7-8700", 3.5,16)
    val computer2 = UpgradedComputer("AMD Ryzen 5", 3.0,32,512)

    println("Компьютер 1:")
    computer1.printInfo()
    println()

    println("Компьютер 2:")
    computer2.printInfo()

    //Компьютер 1:
    //Информация о компьютере
    //Процессор Intel Core i7-8700
    //Тактовая частота процессора 3.5
    //Качество Q 16.35
    //
    //Компьютер 2:
    //Информация о компьютере
    //Процессор AMD Ryzen 5
    //Тактовая частота процессора 3.0
    //Качество Q 288.3
    //Размер жесткого диска 512
    //Качесвто Qp: 288.3


}