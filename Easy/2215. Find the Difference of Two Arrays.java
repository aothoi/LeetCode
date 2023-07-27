/*
Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]

Example 2:
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
*/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num : nums1){ set1.add(num); }    
		for(int num : nums2){ set2.add(num); }   

        List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());

        for(int num : set1)     
			if(!set2.contains(num)) list.get(0).add(num);
		for(int num : set2)                                   
			if(!set1.contains(num)) list.get(1).add(num);

        return list;
    }
}
