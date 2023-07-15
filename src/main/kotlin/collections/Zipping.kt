package collections

fun main(){

    val animals = listOf("fox", "lion", "tiger")
    val colors = listOf("Orange", "Yellow", "White")

    println(animals.zip(colors))
    println(animals zip colors)

    println(animals.zip(colors){a, c -> "The ${a.replaceFirstChar { it.uppercase() }} has $c color" })

    println("")

    val list = listOf(1 to 'a', 2 to 'b', 3 to 'c')
    println(list)
    println(list.unzip())

}