


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}


public class addTwoNumbers {
    public ListNode Solution (ListNode l1 ,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummyHead.next;
    }


    public class Main {
        public static void main(String[] args) {
            
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);
    
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);
    
            addTwoNumbers solution = new addTwoNumbers();
            ListNode result = solution.Solution(l1, l2);
    
            
            System.out.print("Result: ");
            while (result != null) {
                System.out.print(result.val);
                if (result.next != null) {
                    System.out.print(" -> ");
                }
                result = result.next;
            }
        }

    }

    
}


