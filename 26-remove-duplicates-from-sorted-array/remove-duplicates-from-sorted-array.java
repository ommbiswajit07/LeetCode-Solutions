class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[a]!=nums[i]){
                a++;
                nums[a]=nums[i];
            }
        }return a+1;
    }
}