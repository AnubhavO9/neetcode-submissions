class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lsum= new int[nums.length];
        lsum[0] = 1;
        for(int i=1; i < nums.length; i++){
            lsum[i] = lsum[i - 1] * nums[i - 1];
        }
        int right =1;
        for(int i=nums.length -1; i >=0; i--){
            lsum[i] *= right;
            right *= nums[i]; 
        }
        return lsum;
            }
}  
