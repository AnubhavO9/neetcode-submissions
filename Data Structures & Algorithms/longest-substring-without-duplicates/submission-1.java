class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
       for(int i=0; i < s.length(); i++){
        HashMap<Character,Integer> map = new HashMap<>();
        int j=i;
        int curr=0;
            while(j < s.length() && !map.containsKey(s.charAt(j))){
                curr++;
                map.put(s.charAt(j),1);
                j++;
            }
        longest = Math.max(longest, curr);
       }
       return longest;
    }
}
