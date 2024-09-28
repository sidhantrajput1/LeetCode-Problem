class Solution {
    public int search(int[] nums, int target) {
        // int n = nums.length;
        int st = 0, end = nums.length - 1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < nums[end]) { // mid to end is sorted
                if(target > nums[mid] && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // st to mid is sorted
                if(target >= nums[st] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}