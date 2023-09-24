abstract class Person(
    val name:String,
    val age:Int,
    val shootingExperience:Int
){
    abstract fun shoot():Boolean

    fun printInfo(){
        println("Имя: $name, Возвраст: $age, Опыт стрельбы: $shootingExperience")
    }
}

class Novice(
    name: String,
    age: Int,
    shootingExpirience: Int
):Person(name, age, shootingExpirience){
    override fun shoot(): Boolean {
        val hitProbability = 0.01 * shootingExperience
        return kotlin.random.Random.nextDouble() <= hitProbability
    }
}

class Experienced(name: String, age: Int, shootingExperience: Int) : Person(name, age, shootingExperience) {

    override fun shoot(): Boolean {
        val hitProbability = 0.05 * shootingExperience
        return kotlin.random.Random.nextDouble() <= hitProbability
    }
}


class Veteran(name: String, age: Int, shootingExperience: Int) : Person(name, age, shootingExperience) {

    override fun shoot(): Boolean {
        val hitProbability = 0.9 - 0.01 * age
        return kotlin.random.Random.nextDouble() <= hitProbability
    }
}

fun main(){
    val people = arrayOf(
        Novice("Новичек 1", 20, 1),
        Experienced("Обученный 1", 30, 5),
        Veteran("Ветеран 1", 40, 10),
        Experienced("Обученный 2", 35, 6),
        Novice("Новичек 2", 22, 2),
        Novice("Новичек 3", 25, 3),
        Novice("Новичек 4", 27, 4)
    )
    var targetHit = false
    var shooterIndex = 0

    while (!targetHit && shooterIndex<people.size){
        val shooter= people[shooterIndex]
        shooter.printInfo()
        val hit= shooter.shoot()
        if (hit){
            println("Попал в цель")
            targetHit = true
        } else {
            println("Промахнулся")
        }
        shooterIndex++
    }
        //Имя: Новичек 1, Возвраст: 20, Опыт стрельбы: 1
    //Промахнулся
    //Имя: Обученный 1, Возвраст: 30, Опыт стрельбы: 5
    //Промахнулся
    //Имя: Ветеран 1, Возвраст: 40, Опыт стрельбы: 10
    //Попал в цель

}
//Имя: Новичек 1, Возвраст: 20, Опыт стрельбы: 1
//Промахнулся
//Имя: Обученный 1, Возвраст: 30, Опыт стрельбы: 5
//Промахнулся
//Имя: Ветеран 1, Возвраст: 40, Опыт стрельбы: 10
//Промахнулся
//Имя: Обученный 2, Возвраст: 35, Опыт стрельбы: 6
//Попал в цель

