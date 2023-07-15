package kotlin_oop_practice

open class View(){

    open fun draw(){
        println("Drawing the view.")
    }

}

open class Button(var text:String, var orientation:String="" ):View(){

    override fun draw() {
        println("Drawing the $text button..")
        super.draw()
    }

}

class RoundButton(text: String, private var corners:Int):Button(text){

    override fun draw() {
        println("Drawing the $text button with corners $corners")
    }

}

fun main(){

    val view = View()
    view.draw()

    val button = Button("Login", "Centre")
    button.draw()

    val roundBtn = RoundButton("SignUp",20)
    roundBtn.draw()
}