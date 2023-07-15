package collections

fun main(){

    val map = mapOf<Int,String>(1 to "AB",2 to "BC",3 to "CD",1 to "DE")
    println(map[1])
    println(map)

    val map2 = mutableMapOf('a' to 10, 'b' to 20, 'c' to 30)
    map2['a']=40
    println(map2['a'])
    map2.remove('c')
    println(map2)

    println("----")

    map2.forEach { (t, u) ->
        println("$t, $u")
    }
}