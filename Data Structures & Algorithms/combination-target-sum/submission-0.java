class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>>res=new ArrayList<>();
         List<Integer>currPos=new ArrayList<>();

         backtrack(0,nums,target,currPos,res);
         return res;
    }

    private void backtrack(int start,int[]nums,int target,List<Integer>currPos,List<List<Integer>>res){
        //base case

        if(target==0){
            res.add(new ArrayList<>(currPos));
            return;
        }
        if(target<0)return;

        for(int i=start;i<nums.length;i++){
            //choose
            currPos.add(nums[i]);
            //explore
            backtrack(i,nums,target-nums[i],currPos,res);

            //remove
            currPos.remove(currPos.size()-1);
        }
        
    }
}
