/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
*/

//Runtime: 1ms & Memory: 40.8 MB

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        HashMap<Character, Integer>  map= new HashMap<>();

        for(int i=0; i<stones.length(); i++){
            char key = stones.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            } else{
                map.put(key, 1);
            }
        }

        for(int i=0; i<jewels.length(); i++){
            char key = jewels.charAt(i);
            if(map.containsKey(key)){
                count = count + map.get(key);
            }
        }

        return count;
    }
}
