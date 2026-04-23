class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int[] find = new int[26];
        int[] sum = new int[26];
        for(char c : s1.toCharArray()){
            find[c - 'a']++;
        }
        for(int right=0; right < s2.length(); right++){
            sum[s2.charAt(right) - 'a']++;
            if((right -left +1) > s1.length()){
                sum[s2.charAt(left) - 'a']--;
                left++;
            }
            if(Arrays.equals(find,sum)){
                return true;
            }
        }
        return false;
        
    }
}
