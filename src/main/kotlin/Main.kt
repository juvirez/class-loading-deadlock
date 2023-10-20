import kotlin.concurrent.thread

fun main() {
    val thread = thread {
        MatchResult.Failure
    }
    MatchResult.Match(emptyMap())
    thread.join()
}