import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun sum(a: Int, b: Int) = a+b

fun main() = runBlocking<Unit> {

    //async 는 Deferred 라는 타입으로 반환
    val result1: Deferred<Int> = async {
        delay(100)
        sum(1,3)
    }

    println("result1 : ${result1.await()}") // 비동기처리 async 결과를 받아오는 메서드 await

    val result2 = async {
        delay(100)
        sum(2,5)
    }

    println("result2 : ${result2.await()}")

}