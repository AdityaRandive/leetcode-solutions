/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 21_MergeTwoSortedLists 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head;
        ListNode result = new ListNode(-999);
        head = result;
        int flag = 0;
        
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
       
        
        while(p1!=null && p2 != null)
        {
            if(p1.val < p2.val)
            {
                ListNode temp1 = new ListNode(p1.val);
                result.next = temp1;
                result = result.next;
                
                p1 = p1.next;
            }
            else if(p1.val > p2.val)
            {
                ListNode temp1 = new ListNode(p2.val);
                result.next = temp1;
                result = result.next;
                
                p2 = p2.next;
            }
            else if(p1.val == p2.val)
            {
                ListNode temp1 = new ListNode(p1.val);
                ListNode temp2 = new ListNode(p2.val);
                
                result.next = temp1;
                result = result.next;
                result.next = temp2;
                result = result.next;
                
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        while(p1!=null)
        {
            ListNode temp1 = new ListNode(p1.val);
            result.next = temp1;
            result = result.next;
            p1 = p1.next;
        }
        
        while(p2!=null)
        {
            ListNode temp1 = new ListNode(p2.val);
            result.next = temp1;
            result = result.next;
            p2 = p2.next;
        }
        
        return head.next;
    }
}
