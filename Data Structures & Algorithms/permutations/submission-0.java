class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();

        backtrack(nums,curr,ans);
        return ans;
        
    }
    private void backtrack(int[]nums, List<Integer>curr,List<List<Integer>>ans){


        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }//base case
        for(int i=0;i<nums.length;i++){
           
           if(curr.contains(nums[i]))continue;

           curr.add(nums[i]);

           //explore
           backtrack(nums,curr,ans);

           curr.remove(curr.size()-1);

        }
    }
}
