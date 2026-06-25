class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();

        int left=0;
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            char r=s.charAt(i);
            while(set.contains(r)){
               set.remove(s.charAt(left));
               left++;
            }
            set.add(r);

            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
  
}
