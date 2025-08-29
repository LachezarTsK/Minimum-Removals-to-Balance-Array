
using System;

public class Solution
{
    public int MinRemoval(int[] input, int multiplicator)
    {
        Array.Sort(input);
        int left = 0;
        int minimumRemovals = int.MaxValue;

        for (int right = 0; right < input.Length; ++right)
        {
            while (left < right && input[left] * (long)multiplicator < input[right])
            {
                ++left;
            }
            minimumRemovals = Math.Min(minimumRemovals, input.Length - (right - left + 1));
        }

        return minimumRemovals;
    }
}
