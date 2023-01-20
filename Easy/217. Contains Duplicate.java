/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true


Example 2:

Input: nums = [1,2,3,4]
Output: false
*/

//Approach 01: Runtime: 19 ms & Memory: 55.2 MB

public boolean containsDuplicate(int[] nums) {
  
  Set<Integer> numSet = new HashSet<Integer>();
        
  for(int i=0; i<nums.length; i++){
    numSet.add(nums[i]);
  }
  
  if(nums.length == numSet.size())
    return false;
  return true;
}


//Approach 01: Runtime: 8 ms & Memory: 55.3 MB

public boolean containsDuplicate(int[] nums) {
  HashSet<Integer> set = new HashSet<>();
  for(int n : nums){
    if(!set.add(n))
      return true;
  }
  return false;
}
