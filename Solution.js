
/**
 * @param {number[]} input
 * @param {number} multiplicator
 * @return {number}
 */
var minRemoval = function (input, multiplicator) {
    input.sort((x, y) => x - y);
    let left = 0;
    let minimumRemovals = Number.MAX_SAFE_INTEGER;

    for (let right = 0; right < input.length; ++right) {
        while (left < right && input[left] * multiplicator < input[right]) {
            ++left;
        }
        minimumRemovals = Math.min(minimumRemovals, input.length - (right - left + 1));
    }

    return minimumRemovals;
};
