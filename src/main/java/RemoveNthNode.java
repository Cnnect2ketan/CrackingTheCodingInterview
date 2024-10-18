public class RemoveNthNode {

    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {

        // Replace this placeholder return statement with your code
        LinkedListNode start = head, last = head;
        for (int i = 0; i < n; i++) {
            last = last.next;
        }
        while(last.next !=null){
            start = start.next;
            last = last.next;
        }
        if(start.next !=null)
            start.next = start.next.next;
        return head;
    }
}
