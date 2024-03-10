import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() = runBlocking<Unit> {

//    launch {
//        delay(500) // 코루틴 라이브러리에서 정의된 일시중단
//        // Thread.sleep(500)과 비슷하지만 해당 스레드를 블로킹 없이 동작
//        println("World!")
//    }
//
//    println("Hello")


    //launch는 Job 이라는 특별한 반환값을 가진다. launch 의 코루틴을 확인, 취소, LAZY 로 타이밍을 뒤로 미뤄 실행 가능

    val job1: Job = launch {
        val elapsedTime = measureTimeMillis {  // 수행시간을 측정
            delay(150)
        }

        println("async task-1 $elapsedTime ms")
    }
    job1.cancel()

    val job2: Job = launch(start=CoroutineStart.LAZY) {
        val elapsedTime = measureTimeMillis {
            delay(100)
        }
        println("async task-2 $elapsedTime ms")
    }

    println("start task-2")

    job2.start()

}