class Solution {
    private static final String[] MAP={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
          List<String> res = new ArrayList<>();
      if (digits == null || digits.length() == 0) {  
              return res;      
               }
           dfs(digits, 0, new StringBuilder(), res);
           return res;
    }
   
    private void dfs(String digits,int index,StringBuilder curr,List<String>res){

           if(index==digits.length()){
            res.add(curr.toString());
            return;
           }

           String letters=MAP[digits.charAt(index)-'0'];

           for(char ch: letters.toCharArray()){
            curr.append(ch);
            dfs(digits,index+1,curr,res);

            curr.deleteCharAt(curr.length()-1);

           }
        }
}
