package LinkList;

public class FindNthNodeFromEnd {
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
    public Node removeNthFromEnd( int n) {
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length==n){
            return head.next;
        }
        int count = length-n;
        Node ptr = head;
        for(int i = 1 ; i<count;i++){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return head;

    }

     // print
    public void print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        FindNthNodeFromEnd list = new FindNthNodeFromEnd();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        int n = 2;
        list.head = list.removeNthFromEnd(n);
        list.print();



    }
}
