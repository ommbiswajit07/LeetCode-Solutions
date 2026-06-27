class Solution {
    public int trap(int[] height) {
        int sum=0;
        int l = 0;
        int r = height.length-1;
        int lm = height[l];
        int rm = height[r];
        while(l<r){
            if(lm<rm){
                l++;
                lm = Math.max(lm,height[l]);
                sum+=lm-height[l];
            }else{
                r--;
                rm=Math.max(rm,height[r]);
                sum+=rm-height[r];
            }
        }
        return sum;
    }
}