/*
You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.
*/

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - diff * 2)) ++count;
            seen.add(num);
        }
        return count;
    }
}
