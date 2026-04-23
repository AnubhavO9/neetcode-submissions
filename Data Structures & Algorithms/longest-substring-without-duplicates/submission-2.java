class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0, maxLen=0;
       int right=0;
       boolean[] seen = new boolean [256];
       while(right < s.length()){
            while(seen[s.charAt(right)]){
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[s.charAt(right)] = true;
            maxLen = Math.max(maxLen, right - left +1);
            right++;
       }
       return maxLen;
    }
}
