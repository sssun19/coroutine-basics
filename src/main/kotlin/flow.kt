import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// flow : 코루틴에서 리액티브 스타일로 코드를 작성할 수 있음.
fun main() = runBlocking<Unit> {

    val flow = simple()
//    println(flow)
     flow.collect{ value -> println(value) } // subscribe 처럼 flow 는 collect 를 호출해 주어야 코드가 동작.
}

fun simple() : Flow<Int> = flow {
    println("Flow started")

    for (i in 1..3) {
        delay(100)
        emit(i) // 데이터 통제
    }
}