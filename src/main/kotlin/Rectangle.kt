import kotlin.math.PI
import kotlin.math.pow

open class Rectangle(
    var a: Double,
    var b: Double
) {
    open fun Perimeter(): Double{
        return 2*(a+b)

    }

    open fun Area():Double{
        return a*b

    }

    open fun doubleTheSize() {
        a *=2
        b *=2
    }

    open fun printInfo(){
        println("Информация о прямоугольнике")
        println("Стороны a=$a, b=$b")
        println("Периметр ${Area()}")
        println("Площадь ${Perimeter()}")

    }
}
class RectangleRoundedBorders(
    a: Double,
    b: Double,
    var r: Double
):Rectangle(a,b){
    override fun Perimeter(): Double {
        val p = super.Perimeter()
        return p-(8*r)+(2* PI*r)
    }

    override fun Area(): Double {
        val s = super.Area()
        return s - (4 * r.pow(2))+ (PI*r.pow(2))
    }

    override fun doubleTheSize() {
        super.doubleTheSize()
        r *=2
    }
}

fun main(){
    val rectangle1 = Rectangle(12.0,6.0,)
    val rectangle2 = RectangleRoundedBorders(12.0,5.0,2.0)
    println("Прямоугольник 1")
    rectangle1.printInfo()
    println()
    println("После увелечения сторон")
    rectangle1.doubleTheSize()
    rectangle1.printInfo()
    println()

    println("Прямоугольник 2")
    rectangle2.printInfo()
    println()
    println("После увелечения сторон")
    rectangle2.doubleTheSize()
    rectangle2.printInfo()
    println()
}
//Прямоугольник 1
//Информация о прямоугольнике
//Стороны a=12.0, b=6.0
//Периметр 72.0
//Площадь 36.0
//
//После увелечения сторон
//Информация о прямоугольнике
//Стороны a=24.0, b=12.0
//Периметр 288.0
//Площадь 72.0
//
//Прямоугольник 2
//Информация о прямоугольнике
//Стороны a=12.0, b=5.0
//Периметр 56.56637061435917
//Площадь 30.566370614359172
//
//После увелечения сторон
//Информация о прямоугольнике
//Стороны a=24.0, b=10.0
//Периметр 226.2654824574367
//Площадь 61.132741228718345