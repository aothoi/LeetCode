/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

*/

//Approach 01: Runtime - 67ms & Memory - 44.4MB 

class Solution {
    public int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        
        Arrays.sort(nums);

        for(int i=0; i<nums.length;){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                i+=2;
                System.out.println(i);
            } else{
                System.out.println(i);
                return nums[i];
            }
        }

        return -1;
    }
}

//Approach 02: Runtime- 1ms & Memory- 44.6MB

class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;

        for(int i=0; i<nums.length; i++){
            res ^= nums[i];
        }

        return res;
    }
