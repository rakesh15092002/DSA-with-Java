package DoublyLinkedList;

public class IntroductionOfDoublyLL {
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

    // add in mid 
    public void addAfterData(int data,int givenData){
        Node newNode = new Node(data);
        if(head==null){
            return ;
        }
        Node temp = head;
        while(temp!=null && temp.data!=givenData){
            temp = temp.next;
        }

        if (temp == null) {
        System.out.println("Node with data " + givenData + " not found.");
        return;
        }

        newNode.prev=temp;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // add node at begin
    public void addAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head  = newNode;

    }

    // Delete the node
    public int deleteDLL(int data){
        if(head == null ){
            System.out.println("empty List");
            return -1;
        }
        if(head.next == null){
            if(head.data==data){
                int val = head.data;
                head = null;
                return val;
            }
            else{
                System.out.println("not found");
                return -1;
            }
        }
        Node temp = head;
        while(temp!=null && temp.data != data){
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("not found");
            return -1;
        }
        if(temp.prev ==null){
            temp.next.prev = null;
            head = temp.next;
        }
        else if(temp.next==null){
            temp.prev.next = null;
        }
        else{

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        return temp.data;

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
        IntroductionOfDoublyLL list = new IntroductionOfDoublyLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        // list.print();
        // list.addAfterData(5,4);
        // list.print();
        // list.addAtBegin(6);
        // list.print();
        int del = list.deleteDLL(4);
        System.out.println(del);
        list.print();
    }
    
}
