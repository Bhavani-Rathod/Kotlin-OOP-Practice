package kotlin_oop_practice

open class Vehicle(var name:String, var color:String){
    open fun move(){
        println("$name is moving")
    }
}

class Car(name: String, color:String, doors:Int):Vehicle(name,color){

}

class Plane(name: String, color:String, model:String, doors: Int):Vehicle(name, color){

    fun fly(){
        println("$name is flying")
        move()
    }

    override fun move() {
        super.move()
    }

}

fun main(){

    val car = Car("Bugatti", "Black", 4)
    car.move()

    val plane = Plane("Air10","White","12c",2)
    plane.move()
    plane.fly()


}