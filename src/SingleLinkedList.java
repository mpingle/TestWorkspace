
class Node {
    int i; // data part
    Node next; // point to next node
}

class Linked {

    public Node insertAtPostion(int i, int position, Node node){

        if (position < 1)
        {
            System.out.println("Position cannot be less than 1");
            return node;
        }

        if (node == null && position > 1)
        {
            System.out.println("Position is greater than elements exists");
            return node;
        }

        if (node == null && position == 1)
        {
            return getNewNode(i) ;
        }

        if (position == 1){
            Node newNode = getNewNode(i);
            newNode.next = node;
            return newNode;
        }

        node.next =insertAtPostion(i, position-1, node.next);
        return node;
    }

    public Node insertFirst(int i, Node node){
        Node a = getNewNode(i);
        a.next =node;
        return a;
    }
    public void printList(Node node){
        if (node == null) {
            return;
        }
        while(node !=null) {
            System.out.println(node.i + " ");
            node = node.next;
        }
    }
    private Node getNewNode(int i){
        Node a = new Node();
        a.i = i;
        a.next = null;
        return a;

    }

    public Node insert(int i, Node node){
        if (node == null)
        {
            return getNewNode(i);
        }

        // Iterative method

        Node firstNode = node;

        while(node.next !=null){
            node = node.next;
        }

        node.next = getNewNode(i);
        return firstNode;
        //Recursive Method
        /*else {
            node.next = insert(i, node.next);
        }

        return node;*/
    }
}

public class SingleLinkedList {

    public static void main(String[] args){
    // Time Complexity is O(n) and Space Complexity O(1)
        Node root =null;
        Linked a = new Linked();

     //   root = a.insertFirst(100,root) ;
        root = a.insert(12, root);
        root = a.insert(99, root);
        root = a.insert(37, root);
        root = a.insert(50, root);
        root = a.insert(48, root);

      //  root = a.insertFirst(5,root) ;

        root =a.insertAtPostion(69,10,root);
        a.printList(root);

    }
}
