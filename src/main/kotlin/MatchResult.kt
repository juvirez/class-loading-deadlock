sealed class MatchResult {

    data class Match(val parameters: Map<String, String>) : MatchResult()

    data object Failure : MatchResult()

    companion object {
        val MatchWithEmptyParameters = Match(emptyMap())
    }

}
