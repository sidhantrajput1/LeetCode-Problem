class Solution {
    public boolean judgeSquareSum(int c) {

        long left = 0;
        long right = (long) Math.sqrt(c);
        System.out.print(right);

        while ( left <= right) {
            long sum = left * left + right * right;

            if(sum < c) {
                left++;
            } else if(sum > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}