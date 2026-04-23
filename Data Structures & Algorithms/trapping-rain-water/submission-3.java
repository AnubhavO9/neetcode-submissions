class Solution {
    public int trap(int[] heights) {
        // int left = 0;
        // int right = heights.length - 1;
        // int longest = 0;
        // int leftmax=0;
        // int rightmax=0;
        // int sum=0;

        // while (left < right) {
        //    if(heights[left] < heights[right]){
        //         leftmax= Math.max(heights[left],leftmax);
        //         sum += leftmax- heights[left];
        //         left++;
        //    }else{
        //     rightmax= Math.max(heights[right],rightmax);
        //         sum += rightmax- heights[right];
        //         right--;
        //    }
        // }
        // return sum;

        int left=0,right=heights.length-1,leftmax=0,rightmax=0,sum=0;
        while(right > left){
            if(heights[right] < heights[left]){

                rightmax = Math.max(rightmax, heights[right]);
                sum += rightmax - heights[right];
                right--;
            }else{
                leftmax = Math.max(leftmax, heights[left]);
                sum += leftmax - heights[left];
                left++; 
            
            }
        }


return sum;








    }
}
