package kotlin_oop_practice

abstract class Shape(name: String){

    abstract var sides:String
    var height:Int = 0

    abstract fun area(length: Int,width: Int):Int

    open fun  shape(name:String){

    }

}

class Rectangle(name: String, override var sides: String):Shape(name){

    override fun area(length: Int,width: Int):Int {
        return length*width
    }

    override fun shape(name: String) {
        println("The shape is $name")
    }

}

fun main(){

    val rectangle = Rectangle("Rectangle","Four")
    println(rectangle.area(3,6))

    rectangle.shape("Rectangle")

    rectangle.sides = "Four"
    println(rectangle.sides)

}