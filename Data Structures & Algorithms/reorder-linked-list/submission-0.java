/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        // ListNode dummy=new Node(0);
        // ListNode temp=dummy;
         int size=0;
         ListNode temp=head;

         while(temp!=null){
            size++;
            temp=temp.next;
         }
      int [] ans=new int[size];
      //store the linked list values in array 
      temp=head;
      int index=0;
      while(temp!=null){
       ans[index++]=temp.val;
   
       temp=temp.next;
      }
      //re-order the values
      int left=0;
      int right=size-1;
       temp=head;
       boolean pickLeft=true;
    
       while(temp!=null){
        if(pickLeft){
            temp.val=ans[left++];
        }else{
            temp.val=ans[right--];
        }
        pickLeft= !pickLeft;
        temp=temp.next;
       }
       

    }
}
