class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int sum1 = 0;
        for(int j=1; j<=nums.length; j++){
            sum1 = sum1 + j;
        }
        return sum1 - sum;
    }
}