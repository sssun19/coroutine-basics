import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


suspend fun main() {
    doSomething()

}

fun printHello() = println("Hello")

/** suspend 일시 중단이 가능한 함수
 일반 함수에선 suspend 함수를 바로 호출할 수 없음. runBlocking 내부에서 호출하거나 호출하는 함수가 suspend fun 이어야 함.
 async 나 launch 같은 코루틴 빌드를 사용하려면 coroutineScope 빌더를 사용.
 runBlocking 과 coroutineScope 의 차이점 : 현재 실행하고 있는 스레드가 차단(블로킹)되지 않음. **/

suspend fun doSomething() = coroutineScope {

    launch {
        delay(200)
        println("world!")
    }

    launch {
        printHello()
    }
}