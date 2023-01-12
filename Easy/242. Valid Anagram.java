

//Approach 01: Runtime 1056 ms & Memory 43.3 MB

public boolean isAnagram(String s, String t) {
  if(s.length() > t.length())
    return false    
  for(int i=0; i<t.length(); i++){
    int initialLen = s.length();
    s = s.replaceFirst(t.charAt(i)+"", "");
    if(initialLen == s.length()
       return false;
       }
       
       return true;
       }
       
 
//Approach 02: Runtime 1 ms & Memory: 42 MB
       
public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            a[c - 'a']--;
        }
        for (int n : a) {
            if (n != 0) return false;
        }
        return true;
    }
