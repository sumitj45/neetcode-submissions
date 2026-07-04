class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        backtrack(0,candidates,target,curr,res);
        return res;
    }
    private void backtrack(int start,int [] candidates,int target, List<Integer>curr,List<List<Integer>>res){

        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0)return;

        for(int i=start;i<candidates.length;i++){

            if(i>start && candidates[i]==candidates[i-1])continue;
            
            curr.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],curr,res);

            curr.remove(curr.size()-1);
        }
    }
}
