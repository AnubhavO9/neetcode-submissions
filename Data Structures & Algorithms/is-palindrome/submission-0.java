class Solution {
    public boolean isPalindrome(String s) {
        String l = s.replaceAll("[^a-zA-Z0-9]","");
        l = l.toLowerCase();
        for(int i= 0; i < l.length();i++){
            if(l.charAt(i) != l.charAt(l.length() -1-i)){
                return false;
            }
        }
        return true;
    }
}
