public class SinglyLinkList {
    private ListNode head; // Head defined
    private static class ListNode {
        private int data;
        private ListNode next;
        //Constructor
        public ListNode(int data){
            this.data = data;
            this.next =null;
        }

    }
    // Print Link List
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data + " -->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Count no of elements in link list
    public void coundElements(){
        int cnt = 0;
        ListNode Curr = head;
          while (Curr != null){
              cnt ++;
              Curr = Curr.next;
          }
          System.out.println(" No of elements in Link list: " + cnt);
    }

    // add node at the beginning
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // add node at the end

    public void inserLast (int value){

        ListNode lastNode = new ListNode(value);
               if ( head == null)
               {
                   head = lastNode;
                   return;
               }
        ListNode current = head;
               while (current.next != null) {
                   current = current.next;
               }
               current.next = lastNode;

    }

    public void insertAtPostion (int pos, int value){
        ListNode nodeAtPos = new ListNode(value);

        if (pos == 1) {
            nodeAtPos.next = head;
            head = nodeAtPos;
        } else {

            ListNode previous = head;
            int count = 1; // postion -1
            while(count < pos - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = nodeAtPos;
            nodeAtPos.next = current;
        }
    }




    public static void main(String[] args) {
        SinglyLinkList sll = new SinglyLinkList();
        sll.head= new ListNode(9);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        // Now we will connect

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        sll.insertFirst(60);
        sll.insertFirst(70);
        sll.inserLast(80);
        sll.insertAtPostion(9, 100);
        sll.display();
        sll.coundElements();


    }
}
