class Solution {
    public boolean isAnagram(String s, String t) {
        int[] box = new int[26];
        if(s.length() != t.length())
            return false;
        for(int i=0; i < s.length(); i++){
            box[s.charAt(i) -  'a']++;
            box[t.charAt(i) - 'a']--;
        }
        for(int i : box){
           if(i > 0 ){
            return false;
           }
        }   
            return true;

    }
}
