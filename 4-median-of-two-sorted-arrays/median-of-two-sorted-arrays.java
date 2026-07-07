class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length,i=0,j=0,m1=0,m2=0;
        for(int cnt=0;cnt<=(n+m)/2;cnt++){
            m2=m1;
            if(i!=m && j!=n){
                if(nums1[i]>nums2[j]){
                    m1=nums2[j];
                    j++;
                }else{
                    m1=nums1[i];
                    i++;
                }
            }else if (i < m) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }
        if((n+m)%2==1){
            return (double) m1;
        }else{
           double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
        

    }
}