class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        // int longest=0;
        // for(int n : set){
        //     if(!n.contains(n-1)){
        //         int curr = n;
        //         int length=1;
        //         while(set.contains(curr +1)){
        //             length++;
        //             curr++;
        //         }
        //         longest = Math.max(longest, length);
        //     }
        // }
        int longest=0;
        for(int n : set){
            if(!set.contains(n-1)){
                int curr =n;
                int len=1;
                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }
                longest = Math.max(longest,len);
            }

        }
        return longest;
    }
}
