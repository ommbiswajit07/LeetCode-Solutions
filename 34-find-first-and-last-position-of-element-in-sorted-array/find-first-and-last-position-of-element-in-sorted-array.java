class Solution {
    public int[] searchRange(int[] arr, int target) {
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        int[] nums = new int[2];
        int flag = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                nums[0] = i;
                flag = 1;
                break;
            }
        }
        for(int i = arr.length - 1;i>=0;i--){
            if(arr[i]==target){
                nums[1] = i;
                break;
            }
        }
        if(flag == 0){
            return new int[]{-1,-1};
        }
        return nums;
    }
}