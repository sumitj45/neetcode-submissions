class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int [] total=new int [n+m];
        
        int i=0;int j=0; int k=0;
      

      //merge two arrays...
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
             total[k++]=nums1[i++];
            }else{
             total[k++]=nums2[j++];
            }
        }
        while(i<n)total[k++]=nums1[i++];
        while(j<m)total[k++]=nums2[j++];

        int len=m+n;
        //find median

        if(len%2==1){
            return total[len/2];
        }else{
            return (total[len/2] + total[len/2-1])/2.0;
        }

    }
}
