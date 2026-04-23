class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

                for (int i = 0; i < nums.length; i++) {
                            Set<Integer> seen = new HashSet<>();
                                        int target = -nums[i];

                                                    for (int j = i + 1; j < nums.length; j++) {
                                                                    int needed = target - nums[j];

                                                                                    if (seen.contains(needed)) {
                                                                                                        List<Integer> triplet =
                                                                                                                                Arrays.asList(nums[i], nums[j], needed);

                                                                                                                                                    Collections.sort(triplet); // avoid duplicates
                                                                                                                                                                        result.add(triplet);
                                                                                                                                                                                        }
                                                                                                                                                                                                        seen.add(nums[j]);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                    return new ArrayList<>(result);
    }
}
