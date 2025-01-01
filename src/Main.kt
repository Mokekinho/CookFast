import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun prepareBurguer(burguerName: String, time: Long): String{
    delay(time)
    return burguerName
}

fun main() = runBlocking { //it's possible to create own scope with coroutineScope
    println("Welcome to CookFast  your app to manage orders")

    var burguer1 = "Small cheese bacon"
    var burguer2 = "King size triple"

    val first = async { prepareBurguer(burguer1, 1000L) }
    val second = async { prepareBurguer(burguer2, 2000L) }

    println("The ${first.await()} was ready to got taken\nThe ${second.await()} was ready to got taken")


    println("Done")

}