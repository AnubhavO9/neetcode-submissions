class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[126];
        int summary =t.length();
        int len=0;
        int start=0;
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int right=0;
        for(char c : t.toCharArray()){
            count[c]++;
        }
        while(right < s.length()){
            if(count[s.charAt(right)] > 0){
                summary--;
            }
            count[s.charAt(right)]--;
            right++;
            while(summary == 0){
                if( (right - left) < minLen){
                    minLen = right -left;
                    start = left;
                }
                count[s.charAt(left)]++;
                if(count[s.charAt(left)] > 0){
                    summary++;
                }
                left++;
                }
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        }

    }
