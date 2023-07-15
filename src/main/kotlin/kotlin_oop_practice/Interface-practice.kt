package kotlin_oop_practice

interface Engine{
    var name:String

    fun startEngine(){
        println("Starting the engine $name")
    }

    fun stopEngine()
}

class CarEngine(override var name:String, var color:String):Engine{

    override fun startEngine() {
        super.startEngine()
    }

    override fun stopEngine() {
        println("Stopping the engine")
    }

}

fun main(){

    val carEngine = CarEngine("Tesla","Black")
    carEngine.startEngine()

    carEngine.stopEngine()
}