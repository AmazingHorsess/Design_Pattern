open class Computer(
    val processorClockSpeed: Double,
    val proceesorCore: Int,
    val memorySize: Int,
    val hardDriveSize:Int
) {
    open fun calculatePrice(): Double{
        return (proceesorCore*processorClockSpeed)/(100+(memorySize/80)+(hardDriveSize/20))
    }

    open fun suitabilityCheck():Boolean{
        return if (processorClockSpeed>=2000.0 && proceesorCore>=2 && memorySize>=2048 && hardDriveSize>=320){
            true
        } else{
            false
        }

    }

    open fun printInfo(){
        println("Информация о компьютере")
        println("Тактовая частота процессора $processorClockSpeed ")
        println("Количество ядер $proceesorCore")
        println("Количество памяти $memorySize")
        println("Объём жесткого диска $hardDriveSize")
        println("Цена ${calculatePrice()}")
        println("Пригодность ${suitabilityCheck()}")

    }
}
class Laptop(
    processorClockSpeed: Double,
    proceesorCore: Int,
    memorySize: Int,
    hardDriveSize: Int,
    val timeOfWork: Int
):Computer(processorClockSpeed, proceesorCore, memorySize, hardDriveSize){
    override fun calculatePrice(): Double {
        return super.calculatePrice()+(timeOfWork/10)
    }

    override fun suitabilityCheck(): Boolean {
        return if (processorClockSpeed>=2000.0 && proceesorCore>=2 && memorySize>=2048 && hardDriveSize>=320 && timeOfWork>=60){
            true
        } else{
            false
        }
    }
}
fun main(){
    val computer1 = Computer(3200.0,6,4096,1024)
    val computer2 = Laptop(1000.0,1,1024,256,60)
    println("Компьютер 1")
    computer1.printInfo()
    println()
    println("Компьютер 2")
    computer2.printInfo()
}
//Компьютер 1
//Информация о компьютере
//Тактовая частота процессора 3200.0
//Количество ядер 6
//Количество памяти 4096
//Объём жесткого диска 1024
//Цена 95.04950495049505
//Пригодность true
//
//Компьютер 2
//Информация о компьютере
//Тактовая частота процессора 1000.0
//Количество ядер 1
//Количество памяти 1024
//Объём жесткого диска 256
//Цена 14.064516129032258
//Пригодность false