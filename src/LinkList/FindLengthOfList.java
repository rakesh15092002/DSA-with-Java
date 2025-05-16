package LinkList;
public class FindLengthOfList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    Node head;
    // add node
    public void add(int data){
        Node newNode = new Node( data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // find length
    public int findLen(){
        int len = 0;
        Node temp = head;
        while (temp!= null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static void main(String[] args) {
        FindLengthOfList list = new FindLengthOfList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.findLen());
        
    }
}
