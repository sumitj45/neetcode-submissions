class Solution {
    public String minWindow(String s, String t) {
       if (s.length() < t.length()) return "";
       HashMap<Character,Integer>map=new HashMap<>();

       for(char c: t.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
       } 

        int left=0 ,right=0;
        int start=0;
        int minLen = Integer.MAX_VALUE;
        int count=map.size();
        while(right<s.length()){
         char r=s.charAt(right);
         if(map.containsKey(r)){
            map.put(r,map.get(r)-1);
            if(map.get(r)==0){
                count--;
            }
         }
         right++;
          
          while(count==0){
                
                if(right-left<minLen){
                    minLen=right-left;
                    start=left;
                }
                char l=s.charAt(left);
                if(map.containsKey(l)){
                    map.put(l,map.get(l)+1);

                    if(map.get(l)>0){
                        count++;
                    }
                   
                }
                 left++;

          }
          

        }
 return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }
}
