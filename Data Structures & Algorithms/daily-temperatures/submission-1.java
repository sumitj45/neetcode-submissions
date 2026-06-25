
class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[temps.length];

        for (int i = 0; i < temps.length; i++) {
            while (!dq.isEmpty() && temps[dq.peek()] < temps[i]) {
                int prevIdx = dq.pop();
                ans[prevIdx] = i - prevIdx;
            }
            dq.push(i);
              
        }

        return ans;
    }
}