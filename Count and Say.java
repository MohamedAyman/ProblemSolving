//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/886/
class Solution {
    public String count(int s,int e,String res){
        if(s==e)
            return res;
        int cnt = 0;
        String temp = "";
        char c = res.charAt(0);
        for(int i = 0 ; i <res.length();i++){
            if(res.charAt(i)==c){
                cnt++;
            }else{
                temp += cnt+""+c;
                cnt = 1;
                c = res.charAt(i);
            }
        }
        if(cnt>0)
            temp += cnt+""+c;
            
        return count(s+1,e,temp);
    }
    public String countAndSay(int n) {
         if(n<1)
            return "";
        return count(1,n,"1");
    }
}