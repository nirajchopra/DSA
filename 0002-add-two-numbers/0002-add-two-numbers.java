//  public class ListNode {
//      int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null)?l1.val:0;
            int y = (l2 != null)?l2.val:0;
            int sum = x + y + carry;

            carry = sum/10;
            int digit = sum%10;

            current.next = new ListNode(digit);
            current = current.next;

            if(l1 != null)l1=l1.next;
            if(l2 != null)l2=l2.next;
        }
        return dummyHead.next;
    }

    public static void printList(ListNode head) {
    while (head != null) {
        System.out.print(head.val);
        if (head.next != null) System.out.print(" -> ");
        head = head.next;
    }
    System.out.println();
}

public static void main(String[] args) {
    // Create first list: 2 -> 4 -> 3
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    // Create second list: 5 -> 6 -> 4
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    Solution sol = new Solution();
    ListNode result = sol.addTwoNumbers(l1, l2);

    // Print the result
    printList(result);  // Output: 7 -> 0 -> 8
}

}