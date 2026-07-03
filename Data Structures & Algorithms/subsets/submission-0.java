class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currPath=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();

         backtrack(0,nums,new ArrayList<>(),result);
         return result;
    }
    private void backtrack(int start,int[] nums,List<Integer> currPath,List<List<Integer>>result){

    
    result.add(new ArrayList<>(currPath));
       
     //step 2 iterate over choices
       for(int i=start;i<nums.length;i++){
       

         // step 4: make the choice
         currPath.add(nums[i]);
         // step 5 : deep down check other option
         backtrack(i+1,nums,currPath,result);

         //step 6: undo the choice(backtrack)

         currPath.remove(currPath.size()-1);

       }

    }

}
