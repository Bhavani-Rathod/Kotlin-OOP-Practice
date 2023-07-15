package kotlin_oop_practice

fun main(){

    val user1 = User("Bhavani",23)
    val user2 = User("Bhavani",23)

    println(user1.equals(user2))
    println(user1.hashCode())

    println(user1)

    println(user1.copy(name = "Sunny", age = 28))

}

data class User(var name:String, var age:Int){
    var lastName:String = ""
}