/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        
        int count=0;
       
        
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(root,root.val));
        
        while(!q.isEmpty()){
          Pair p=q.poll();
          TreeNode node=p.node;
          int maxSoFar=p.max;

          if(node.val>=maxSoFar){
            count++;
          }
          int newMax=Math.max(maxSoFar,node.val);

          if(node.left!=null){
            q.offer(new Pair(node.left,newMax));
          }
          if(node.right!=null){
            q.offer(new Pair(node.right,newMax));
          }
        }
return count;
    }
}
class Pair{
    TreeNode node;
    int max;

    Pair(TreeNode node,int max){
        this.node=node;
        this.max=max;
    }
}
