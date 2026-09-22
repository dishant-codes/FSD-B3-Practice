import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ListSortProblem {

    public ListNode sortList(ListNode head){

        if (head == null || head.next == null){
            return head;
        }
        // 2-> 5 -> 3 -> 1 -> 4
        // mid =  3
        ListNode mid = getMid(head);
        // 2-> 5 ->  = left
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // 3 -> 1 -> 4
        return merge(left, right);
    }

    public ListNode getMid(ListNode head){

        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }


        if (prev != null){
            prev.next = null;
        }

       return slow;
    }


    public ListNode merge(ListNode l1, ListNode l2){


        ListNode dummy = new ListNode(0);

        ListNode tail = dummy;

        while(l1 != null && l2 !=null){

            // l1 = 2, 4, 6

            // l2 = 3, 1, 5


            if (l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }


        if (l1 != null) {
            tail.next = l1;
        }

        if (l2 != null){
            tail.next = l2;
        }


        return dummy.next;
    }

    public static void printList(ListNode head){

        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.val + "-> ");
            curr = curr.next;
        }

        System.out.println("null");

    }


    public static ListNode buildList(int[] arr){

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;


        for (int i = 0; i < arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return dummy.next;
    }

    static void main(String[] args) {

        int[] inputValue = {4,2,1,3};

        ListNode head = buildList(inputValue);
        ListSortProblem solution = new ListSortProblem();
        ListNode sorted = solution.sortList(head);
        printList(sorted);


    }

}
