/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Example:
Input: n = 3
Output: ["1","2","Fizz"]
*/

//Approach 01 : Runtime 2 ms & Memory 44.9 MB

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<String>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            } else if(i%3==0){
                arr.add("Fizz");
            } else if(i%5==0){
                arr.add("Buzz");
            } else{
                arr.add(i+"");
            }
        }

        return arr;
    }
}

//Approach 02 : Runtime 1 ms & Memory 44.8 MB

class Solution {
    public List fizzBuzz(int n) {
        List arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }

        return arr;
    }
}
