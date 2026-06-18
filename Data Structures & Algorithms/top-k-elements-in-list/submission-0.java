class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

      
        List<Integer> keys = new ArrayList<>(map.keySet());
        int[] ans = new int[k];

        
        for (int i = 0; i < k; i++) {
            int maxKey = keys.get(0); 

          
            for (int key : keys) {
                if (map.get(key) > map.get(maxKey)) {
                    maxKey = key;
                }
            }

            ans[i] = maxKey; 
            keys.remove(Integer.valueOf(maxKey)); 
        }

        return ans;
    }
}