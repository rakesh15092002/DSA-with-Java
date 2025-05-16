package LinkList;

public class FindMidOfList {
    class Node{
        int data;
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

    public int middleNode() {
        Node slow=head;
        Node fast=head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
       FindMidOfList list = new FindMidOfList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        // list.addNode(6);
        System.out.println(list.middleNode());
    }
}
