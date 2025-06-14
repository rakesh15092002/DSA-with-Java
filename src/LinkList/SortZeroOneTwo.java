package LinkList;
public class SortZeroOneTwo {
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

public void sortList() {
        Node zero  = new Node(-1);
        Node one = new Node(-1);
        Node two = new Node(-1);
        Node oneTail = one;
        Node zeroTail = zero;
        Node twoTail = two;
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zeroTail.next = temp;
                zeroTail = zeroTail.next;

            }
            if(temp.data==1){
                oneTail.next = temp;
                oneTail = oneTail.next;
            }
            if(temp.data==2){
                twoTail.next = temp;
                twoTail = twoTail.next;
            }
            temp = temp.next;
        }
        twoTail.next = null;
        oneTail.next = two.next;
        zeroTail.next = one.next;

       head =  zero.next;

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
        SortZeroOneTwo list = new SortZeroOneTwo();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.sortList();
        list.print();


    }
}
