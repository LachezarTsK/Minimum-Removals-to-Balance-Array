
import kotlin.math.min

class Solution {

    fun minRemoval(input: IntArray, multiplicator: Int): Int {
        input.sort()
        var left = 0
        var minimumRemovals = Int.MAX_VALUE

        for (right in input.indices) {
            while (left < right && input[left] * multiplicator.toLong() < input[right]) {
                ++left
            }
            minimumRemovals = min(minimumRemovals, input.size - (right - left + 1))
        }

        return minimumRemovals
    }
}
