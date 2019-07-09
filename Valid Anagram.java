//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/882/
class Solution {
    public boolean isAnagram(String s, String t) {
        int arr [] = new int [26];
        int arr1 [] = new int [26];
        if(s.length()!=t.length())
            return false;
        for(int i = 0 ; i < s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < t.length();i++){
            arr1[t.charAt(i)-'a']++;
        }
        for(int i = 0 ;i < 26 ; i++){
            if(arr[i] != arr1[i])
                return false;
        }
        return true;
    }
}