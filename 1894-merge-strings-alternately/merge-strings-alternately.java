class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int a = word1.length(), b = word2.length();
        while(a>0 && b>0){
            s+= word1.charAt(word1.length()-a);
            s+=word2.charAt(word2.length()-b);
            a--;
            b--;
        }
        while(b>0){
           s+=word2.charAt(word2.length()-b);
           b--; 
        }
        while(a>0){
            s+= word1.charAt(word1.length()-a);
            a--;
        }
        return s;
    }
}