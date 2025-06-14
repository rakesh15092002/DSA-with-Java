package Stack;

public class ImplementQueueUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head,tail=null;

    public void offers(int data){
        Node newNode = new Node(data);
        
        if(tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
             tail = newNode;

        }
    }

    public int poll(){
        if(head == null){
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int element(){
        if(head == null){
            return -1;
        }
        return head.data;
    }
    public int queSize(){
        if(head==null){
            return -1;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count ++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        ImplementQueueUsingLinkedList que = new ImplementQueueUsingLinkedList();
        que.offers(1);
        que.offers(2);
        que.offers(3);
        que.offers(4);
        que.offers(5);
        System.out.println("front element is: "+ que.element());
        System.out.println("size is: "+ que.queSize());

        System.out.println("deleted element is : "+ que.poll());
        System.out.println("size is: "+ que.queSize());
        System.out.println("deleted element is : "+ que.poll());
        System.out.println("size is: "+ que.queSize());
        System.out.println("front element is: "+ que.element());
        // System.out.println("size is: "+ que.queSize());
    }

}
