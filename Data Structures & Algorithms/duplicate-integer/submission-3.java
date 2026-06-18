class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashMap<Integer,Integer>res=new HashMap<>();
    for(int num:nums){
       if(res.containsKey(num)) return true;
       res.put(num,1);
    }
    return false;
    }
}