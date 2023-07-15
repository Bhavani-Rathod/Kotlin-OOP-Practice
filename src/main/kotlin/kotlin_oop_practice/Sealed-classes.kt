package kotlin_oop_practice


sealed class Result(var message:String){

    fun showMessage(){

        println("Result: $message")

    }

    class Success(message: String):Result(message)

    class Failure(message: String):Result(message)

    sealed class Error(message: String):Result(message){
        class RecoverableError(exception:Exception ,message: String):Error(message)
        class NonRecoverableError(exception: Exception ,message: String):Error(message)
    }

}

fun main(){

    val success = Result.Success("SUCCESS!")
    val failure = Result.Failure("FAILURE!")

    getData(success)

}

fun getData(result: Result){

    when(result){
        is Result.Success -> result.showMessage()
        is Result.Failure -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }

}
