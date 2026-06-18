class Solution {
    public int characterReplacement(String s, int k) {
        
       HashMap<Character,Integer>map=new HashMap<>();
       int left=0;
       int maxFreq=0;
       int maxLen=0;
       for(int right=0;right<s.length();right++){
        char r=s.charAt(right);
        map.put(r,map.getOrDefault(r,0)+1);
        //current character ka maxFreq
        maxFreq=Math.max(maxFreq,map.get(r));
        //window size (replacement is needed or not)
        while((right-left+1)-maxFreq > k ){
            char l=s.charAt(left);
            map.put(l,map.get(l)-1);
            left++;
        }

        maxLen=Math.max(maxLen,right-left+1);
       }
       return maxLen;
       
    }
}
