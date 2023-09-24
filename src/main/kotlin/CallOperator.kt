open class CallOperator (
    val operatorName: String,
    val costPerMin: Double,
    val areaOfCoverage: Double,

){


    open fun calculateQuality(): Double{
        return (100 * (areaOfCoverage/costPerMin))
    }

    open fun printInfo(){
        println("Информация о мобильном операторе")
        println("Оператор $operatorName")
        println("Стоимость одной минуты разговора $costPerMin")
        println("Плошадь покрытия $areaOfCoverage")
        println("Качество Q ${calculateQuality()}")
    }

}
//0
class UpgradedCallOperator(
    operatorName: String,
    costPerMin: Double,
    areaOfCoverage: Double,
    val costForConnect: Boolean
): CallOperator(operatorName,costPerMin, areaOfCoverage){
    override fun calculateQuality(): Double {
        var q = super.calculateQuality()
        return if (costForConnect){
            q*1.5
        } else {
            q*0.7
        }

    }




}

fun main(){
    val operator1 = CallOperator("Altel",50.0,10000.0)
    val operator2 = UpgradedCallOperator("Tele2", 75.0, areaOfCoverage = 6000.0, costForConnect = true)

    println("Оператор 2:")
    operator1.printInfo()
    println()
    println("Оператор2:")
    operator2.printInfo()

    //Оператор 2:
    //Информация о мобильном операторе
    //Оператор Altel
    //Стоимость одной минуты разговора 50.0
    //Плошадь покрытия 10000.0
    //Качество Q 20000.0
    //
    //Оператор2:
    //Информация о мобильном операторе
    //Оператор Tele2
    //Стоимость одной минуты разговора 75.0
    //Плошадь покрытия 6000.0
    //Качество Q 12000.0





}