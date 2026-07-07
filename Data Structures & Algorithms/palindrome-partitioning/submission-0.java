class Solution {
    public List<List<String>> partition(String s) {
       List<String>curr=new ArrayList<>();
       List<List<String>>res=new ArrayList<>();
        backtrack(0,s,new ArrayList<>(),res);
        return res;

    }
    private void backtrack(int start, String s,List<String>curr,List<List<String>>res){

        //base case
        if(start==s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int end=start;end<s.length();end++){
        if(isPalindrome(s,start,end)){
            curr.add(s.substring(start,end+1));

            backtrack(end+1,s,curr,res);

            curr.remove(curr.size()-1);
        }
        }
    }

    private boolean isPalindrome(String s,int left,int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;

            left++;
            right--;
        }
        return true;
    }
}
