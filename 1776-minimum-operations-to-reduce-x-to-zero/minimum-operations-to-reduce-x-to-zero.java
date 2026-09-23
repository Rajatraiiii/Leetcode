class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        // Calculate total sum
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        long target = total - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return n;
        }

        int left = 0;
        long sum = 0;
        int maxLen = -1;

        // Sliding window
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // Shrink window if sum becomes too large
            while (left <= right && sum > target) {
                sum -= nums[left];
                left++;
            }

            // Found a subarray with required sum
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        if (maxLen == -1) {
            return -1;
        }

        return n - maxLen;
    }
}