package DoublyLinkedList;

public class ReverseDLL {
    class Node {
        int data;
        Node next; 
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    Node head;
    // create Node to the end
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
    }

 public void reverseDll() {
    if (head == null || head.next == null) {
        return;
    }

    Node curr = head;
    Node prevNode = null;

    while (curr != null) {
        // Swap prev and next
        prevNode = curr.prev;
        curr.prev = curr.next;
        curr.next = prevNode;

        // Move to next node (which is original next, now in prev)
        curr = curr.prev;
    }

    // After loop, temp is at the node before null — which is the new head
    if (prevNode != null) {
        head = prevNode.prev;
    }
}


     // printing the list
    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseDLL list = new ReverseDLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        // list.print();
        list.reverseDll();
        list.print();
    }
}
