
import java.util.Arrays;

public class Solution {

    public int minRemoval(int[] input, int multiplicator) {
        Arrays.sort(input);
        int left = 0;
        int minimumRemovals = Integer.MAX_VALUE;

        for (int right = 0; right < input.length; ++right) {
            while (left < right && input[left] * (long) multiplicator < input[right]) {
                ++left;
            }
            minimumRemovals = Math.min(minimumRemovals, input.length - (right - left + 1));
        }

        return minimumRemovals;
    }
}
