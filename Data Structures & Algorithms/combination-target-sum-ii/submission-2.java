class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>curpos=new ArrayList<>();
        backtrack(0,candidates,target,curpos,res);
        return res;
    }

    private void backtrack(int start, int [] candidates,int target,List<Integer>curpos,List<List<Integer>>res){

        //back track
        if(target==0){
            res.add(new ArrayList<>(curpos));
            return;
            }
           
        if(target<0)return;

        for(int i=start;i<candidates.length;i++){

            if(i>start && candidates[i]==candidates[i-1])continue;
            curpos.add(candidates[i]);
            
            //explore the other posibilities
           
            backtrack(i+1,candidates,target-candidates[i],curpos,res);
            

            curpos.remove(curpos.size()-1);
        }
        
    }
}
