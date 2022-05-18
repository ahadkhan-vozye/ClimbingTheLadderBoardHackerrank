fun main() {
    val result = climbingLeaderboard(arrayOf(1), arrayOf(1, 1))
    println(result.joinToString("\n"))
}

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    var tempRanked = ArrayList(ranked.toList())
    val rankedArray = Array(player.size) { 0 }

    for (i in player.indices) {
        tempRanked.add(player[i])
        tempRanked = ArrayList(tempRanked.distinct())
        tempRanked.sortDescending()
        // var index = getPosition(tempRanked, it)
        val index = tempRanked.indexOf(player[i])
        if (index != -1) {
            rankedArray[i] = index + 1
            tempRanked.removeAt(index)
        }
    }

    return rankedArray
}