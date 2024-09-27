class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1;
        int ans = -1;

        while(st <= end) {
            int mid = st + (end - st)/2;

            if(nums[mid] <= nums[n-1]) {
                ans = nums[mid];
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}