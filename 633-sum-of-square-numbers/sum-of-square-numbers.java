class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);
        while(a<=b){
            long d = a*a + b*b;
            if(d<c){
                a++;
            }else if(d>c){
                b--;
            }else{
                return true;
            }
        }return false;
    }
}