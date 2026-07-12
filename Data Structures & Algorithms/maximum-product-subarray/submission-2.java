class Solution {
    public int maxProduct(int[] nums) {
        
        int []dp=new int[nums.length];

        int maxi=nums[0];
        int mini=nums[0];

        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
             int curr=nums[i];
             int maxTemp=Math.max(curr,Math.max(curr*maxi,curr*mini));
             int minTemp=Math.min(curr,Math.min(curr*maxi,curr*mini));
            
            maxi=maxTemp;
            mini=minTemp;
            ans=Math.max(ans,maxi);
        }
        return ans;
    }
}
