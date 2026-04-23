class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] box = new int[26];
            for(char c : s.toCharArray()){
                box[c - 'a']++;
            }
            StringBuilder build = new StringBuilder();
            for(int i: box){
                build.append("#").append(i);
                }
            String key = build.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
         return new ArrayList<>(map.values());

    }
}
