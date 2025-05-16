package LinkList;

public class DeleteTheNode {
    class Node{
        int data ; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    // add Node 
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next !=null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print
    public void print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    // delet the last element
    public int deleteAtLast(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        if(head.next==null){
            int val = head.data;
            head=null;
            return val;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;
        
    }

    // delete at first
    public int deleteAtFirst(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        // Node temp = head;
        int val = head.data ;
        head = head.next;
        return val;
        
    }

    // Delete a node with the given data from the list
public int deleteAtMid(int data) {
    if (head == null) {
        System.out.println("empty");
        return -1;
    }

    // If the head node contains the data
    if (head.data == data) {
        int val = head.data;
        head = head.next;
        return val;
    }

    Node temp = head;

    // Traverse to find the node just before the one to delete
    while (temp.next != null && temp.next.data != data) {
        temp = temp.next;
    }

    // If the data is not found
    if (temp.next == null) {
        System.out.println("Node with data " + data + " not found.");
        return -1;
    }

    // Delete the node
    int val = temp.next.data;
    temp.next = temp.next.next;
    return val;
}





    public static void main(String[] args) {
        DeleteTheNode list = new DeleteTheNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        // list.print();
        // list.deleteAtLast();
        // System.out.println(list.deleteAtFirst());
        list.deleteAtMid(1);
        list.print();
    }

}
