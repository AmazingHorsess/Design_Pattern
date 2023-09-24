import kotlin.math.sqrt
import kotlin.math.pow

open class Triangle(
    var a: Double,
    var b: Double,
    var c: Double,
) {
    //По формуле Герона
    //Если у вас есть длины всех трех сторон треугольника (a, b и c), вы можете использовать формулу Герона:
    //Полупериметр (s) = (a + b + c) / 2
    //Площадь (A) = √(s * (s - a) * (s - b) * (s - c))
    open fun calculateArea(): Double{
        val s = (a+b+c)/2.0
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
    open fun calculatePerimeter():Double {

        return a+b+c
    }

   open fun printInfo(){
        println("Информация о Треугольнике")
        println("Стороны треугольника: a=$a, b=$b, c=$c")
        println("Периметр: ${calculatePerimeter()}")
        println("Площадь: ${calculateArea()}")

   }
}
class Quadrangle(
    a:Double,
    b:Double,
    c: Double,
    val d: Double,
    val e: Double,
    val f: Double

):Triangle(a, b, c){
    override fun calculateArea(): Double {
        return sqrt(4 * e.pow(2) * f.pow(2) - (b.pow(2) + d.pow(2) - a.pow(2) - c.pow(2)).pow(2) / 16.0)
    }


    override fun calculatePerimeter(): Double {
        return (a+b+c)+calculateArea()
    }

    override fun printInfo() {
        println("Информация о Четырехугольнике")
        println("Стороны четырехугольника: a=$a, b=$b, c=$c, d=$d")
        println("Диагонали e=$e, f=$f")
        println("Периметр: ${calculatePerimeter()}")
        println("Площадь: ${calculateArea()}")
    }

}

fun main(){
    val triangle1 = Triangle(12.0,5.0,10.0)
    val triangle2 = Quadrangle(12.0,5.0,10.0, 4.0, 2.0, 3.0)

    println("Треугольник 1")
    triangle1.printInfo()
    println()
    println("Треугольник 2")
    triangle2.printInfo()
    //Треугольник 1
    //Информация о Треугольнике
    //Стороны треугольника: a=12.0, b=5.0, c=10.0
    //Периметр: 27.0
    //Площадь: 24.544602257930357
    //
    //Треугольник 2
    //Информация о Четырехугольнике
    //Стороны четырехугольника: a=12.0, b=5.0, c=10.0, d=4.0
    //Диагонали e=2.0, f=3.0
    //Периметр: NaN
    //Площадь: NaN





}