
#include <limits>
#include <ranges>
#include <vector>
using namespace std;

class Solution {

public:
    int minRemoval(vector<int>& input, int multiplicator) const {
        ranges::sort(input);
        int left = 0;
        int minimumRemovals = numeric_limits<int>::max();

        for (int right = 0; right < input.size(); ++right) {
            while (left < right && input[left] * static_cast<long long>(multiplicator) < input[right]) {
                ++left;
            }
            minimumRemovals = min(minimumRemovals, static_cast<int>(input.size()) - (right - left + 1));
        }

        return minimumRemovals;
    }
};
