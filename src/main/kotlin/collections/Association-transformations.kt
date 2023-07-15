package collections

fun main(){

    val list = listOf("one","two","three")
    println(list.associateWith { it.length })
    println(list.associateBy { it.first().uppercase() })

    println(list.associateBy(keySelector = {it.length}, valueTransform = {it.uppercase()}))

}