import kotlin_oop_practice.View

fun main(args: Array<String>) {

    val button = Button("Login", "centre")
    button.draw(button.text)

}

class Button(var text:String, var orientation:String="" ){

     fun draw(text: String) {
        println("Drawing the $text button..")

    }
}