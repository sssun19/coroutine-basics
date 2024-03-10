import kotlinx.coroutines.runBlocking


fun main() {

    runBlocking {// 코루틴을 생성해주는 코루틴 빌더
        println("Hello")
        println(Thread.currentThread().name) // vm option 에서 -Dkotlinx.coroutines.debug 설정해주면 어떤 코루틴에서 실행했는지 로그로 알려줌
    }

    println("World")
    println(Thread.currentThread().name)

}