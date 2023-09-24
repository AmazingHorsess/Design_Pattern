open class Cable (
    val cableType: String,
    val cableCoresCount: Int,
    val cableDiameter: Double,

){


    open fun calculateQuality(): Double{
        return (cableDiameter/cableCoresCount)
    }

    open fun printInfo(){
        println("Информация о кабеле")
        println("Тип кабеля $cableType")
        println("Количество жил кабеля $cableCoresCount")
        println("Диаметр ${cableDiameter}")
        println("Качество Q ${calculateQuality()}")
    }

}
//0
class UpgradedCabel(
    cableType: String,
    cableCoresCount: Int,
    cableDiameter: Double,
    val braiding: Boolean
): Cable(cableType, cableCoresCount, cableDiameter){
    override fun calculateQuality(): Double {
        val q = super.calculateQuality()
        return if (braiding){
            2*q
        } else {
            0.7*q
        }

    }




}

fun main(){
    val cable1 = Cable("Тип 1 ",20,2.25)
    val cable2 = UpgradedCabel("Тип 2", 30, 1.0, true)

    println("Кабель 1:")
    cable1.printInfo()
    println()
    println("Кабель 2:")
    cable2.printInfo()

    //Кабель 1:
    //Информация о кабеле
    //Тип кабеля Тип 1
    //Количество жил кабеля 20
    //Диаметр 2.25e
    //Качество Q 0.1125
    //
    //Кабель 2:
    //Информация о кабеле
    //Тип кабеля Тип 2
    //Количество жил кабеля 30
    //Диаметр 1.0e
    //Качество Q 0.06666666666666667





}