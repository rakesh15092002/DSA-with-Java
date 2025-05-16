package LinkList;
public class ReversTheList {
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

    // reverse the list
    public void reverse(){
        Node prev = head;
        Node curr = head.next;
        // Node post = head;
        while (curr!=null) {
            Node post = curr.next;
            curr.next = prev;
            prev = curr;
            curr = post;
        }
        head.next = null;
        head = prev;
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
        ReversTheList list = new ReversTheList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.reverse();
        list.print();

    }
}
