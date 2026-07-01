class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int best = 0;
        while(l<r){
            int max = (Math.min(height[l],height[r]))*(r-l);
            best = Math.max(best,max);
            if(height[l]<height[r]){l++;}
            else{r--;}
        }return best;
    }
}