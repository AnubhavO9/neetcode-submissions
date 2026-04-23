class Solution {
    public int trap(int[] heights) {
         int left = 0;
        int right = heights.length - 1;
        int longest = 0;
        int leftmax=0;
        int rightmax=0;
        int sum=0;

        while (left < right) {
           if(heights[left] < heights[right]){
                leftmax= Math.max(heights[left],leftmax);
                sum += leftmax- heights[left];
                left++;
           }else{
            rightmax= Math.max(heights[right],rightmax);
                sum += rightmax- heights[right];
                right--;
           }
        }
        return sum;
    }
}
