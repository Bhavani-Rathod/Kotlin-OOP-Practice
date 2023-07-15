package kotlin_oop_practice

interface A{
    fun print1(){

    }
}

interface B{
    fun print2(){

    }
}

open class C():A{
    fun print3(){

    }
}

class D():B{
    fun print4(){

    }
}

class E():A,C(),B by D(){
    override fun print1() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }

}