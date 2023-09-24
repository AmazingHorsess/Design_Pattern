
open class Photocamera(
    val photocameraModel: String,
    val zoom: Double,
    var photocameraMaterial: String,
    ) {
    open fun calculatePrice(): Double {
        return if(photocameraMaterial == "Plastic"){
            (zoom+2)*10

        } else{
            (zoom+2)*15

        }

    }

    fun printInfo() {
        println("Информация о Фотоаппарате")
        println("Модель $photocameraModel")
        println("Увелечение $zoom")
        println("Материал корпуса $photocameraMaterial")
        println("Стоимость ${calculatePrice()}")
        println(priceCheck())
    }

    fun priceCheck() {
        val price = calculatePrice()
        if (price >200){
            println("Фотоаппарат дорогой")
        } else {
            println("Фотоаппарат Дешевый")
        }
    }
}

class DigitalPhotocamera(
    photocameraModel: String,
    zoom: Double,
    photocameraMaterial: String,
    var megaPixels: Int
) : Photocamera(photocameraModel,zoom,photocameraMaterial) {

    override fun calculatePrice(): Double {
        return super.calculatePrice()*megaPixels
    }


    fun updateModel() {
        megaPixels += 2
    }
}

fun main() {

    val photocamera1 = Photocamera("Canon EOS", 4.0, "Plastic")
    val photocamera2 = DigitalPhotocamera("Sony e60",3.0,"Metall",8)

    photocamera1.printInfo()



    photocamera2.printInfo()
    println()
    println("После улучшения ")
    photocamera2.updateModel()
    photocamera2.printInfo()
    //Информация о Фотоаппарате
    //Модель Canon EOS
    //Увелечение 4.0
    //Материал корпуса Plastic
    //Стоимость 60.0
    //Фотоаппарат Дешевый

    //Информация о Фотоаппарате
    //Модель Sony e60
    //Увелечение 3.0
    //Материал корпуса Metall
    //Стоимость 600.0
    //Фотоаппарат дорогой

    //
    //После улучшения
    //Информация о Фотоаппарате
    //Модель Sony e60
    //Увелечение 3.0
    //Материал корпуса Metall
    //Стоимость 750.0
    //Фотоаппарат дорогой






}
