class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right=heights.length -1;
        int area=0;
        int longest=0;
       while(right > left){
         area = Math.min(heights[left], heights[right]) * (right -left);
         longest = Math.max(longest, area);
         if(heights[left] < heights[right] ){
            left++;
         }else{
            right--;
         }
       } 
       return longest;
    }
}
