class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();

        backtrack(nums,curr,res);
        return res;
    }
    
    private void backtrack(int[]nums,List<Integer>curr,List<List<Integer>>res){
    
    //base case
    if(curr.size()==nums.length){
        res.add(new ArrayList<>(curr));
        return;
    }

    for(int i=0;i<nums.length;i++){
       
       if(curr.contains(nums[i]))continue;
       curr.add(nums[i]);

       //explore 
        backtrack(nums,curr,res);

        curr.remove(curr.size()-1);
    }


    }
}
