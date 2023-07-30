/*
Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
*/

class Solution {
    public String decodeMessage(String key, String message) {
        String ans = "";
        int count = 0;
        char [] msg = message.toCharArray();
        char [] k = key.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        
        for(char c: k){
            if(count == 26) break; 
            if(c != ' ' && !map.containsKey(c)){
                map.put(c, (char)(97+count));
                count++;
            }
        }

        for(char c: msg){
            if(c == ' ') ans += " ";
            else ans += map.get(c);
        }
        return ans;
    }
}
