class Solution {
    public boolean containsDuplicate(int[] nums) {
       
       Arrays.sort(nums);
       System.out.print(nums);

       for(int i = 1; i < nums.length; i++) {
         if(nums[i] == nums[i-1]) {
            return true;
         }
       }

       return false;

        // int n = nums.length;

        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}