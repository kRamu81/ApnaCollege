class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}