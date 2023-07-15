package kotlin_oop_practice



fun main(){

    var loginBtn = Buttons("Login",123,object :onClickListener{
        override fun onClick() {
            println("Not yet implemented")
        }

    })
    var signUpBtn = Buttons("SignUp",132,object :onClickListener{
        override fun onClick() {
            println("Not yet implemented")
        }

    })

}

class Buttons(var text:String, var id:Int, clickListener:onClickListener)

interface onClickListener{

    fun onClick()

}