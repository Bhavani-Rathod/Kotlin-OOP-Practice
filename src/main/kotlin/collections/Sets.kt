package collections

fun main(){

    val user1 = User("Bhavani")
    val user2 = User("Subhash")
    val user3 = User("Rathod")
    val user4 = User("Kavita")
    val user5 = User("Rathod")

    val userSet = mutableSetOf<User>(user1,user2,user3,user4,user5)
    userSet.forEach { println(it.name) }

    println(userSet)

    val set = setOf("A","B","C","D")
    println(set)

    val set2 = mutableSetOf("Round","Square",'v',2,2,'c',1)
    println(set2)

}

data class User(var name:String)