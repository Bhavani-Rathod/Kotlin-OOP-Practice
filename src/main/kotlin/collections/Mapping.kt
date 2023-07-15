package collections

fun main(){

    val names = setOf(1,2,3,4,5)

    println(names.map { it*it })
    println(names.map { it+2 })

    println(names.map { i -> i-1 })

    names.map { i -> if (i==2) println(i) else println("-") }

    println("")

    names.mapIndexedNotNull { index, i -> if (index==0) null else println(index*i) }

    names.mapIndexed { index, i -> if (index==2) println(i) else println("-") }

    mapping()

}

fun mapping(){

    val map2 = mapOf('A' to 1, 'B' to 2, 'C' to 3)

    println(map2.mapKeys { it.key.lowercase() })

    println(map2.mapValues { it.value*2 })

    val list = listOf(1,2,3,4,5)
    println(list.map { i -> i+i })

}