
package main
import (
    "math"
    "slices"
)

func minRemoval(input []int, multiplicator int) int {
    slices.Sort(input)
    left := 0
    minimumRemovals := math.MaxInt

    for right := range input {
        for left < right && int64(input[left]) * int64(multiplicator) < int64(input[right]) {
            left++
        }
        minimumRemovals = min(minimumRemovals, len(input) - (right - left+1))
    }

    return minimumRemovals
}
