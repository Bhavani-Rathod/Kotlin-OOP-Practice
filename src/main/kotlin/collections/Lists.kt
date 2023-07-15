package collections

fun main(){

    val list = listOf(1,2,3,4,5,6)
    println(list[1])
    list.forEach { println(it) }

    println("")

    val names = mutableListOf("bhavani","Subhash","Rathod",2,'c',2,2,2)

    names[5] = 1.2

    names.add(3)
    names.remove(2)
    names.removeAt(3)

    println(names)
    names.forEach { println(it) }

}