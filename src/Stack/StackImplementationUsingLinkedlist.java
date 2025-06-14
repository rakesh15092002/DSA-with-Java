package Stack;

public class StackImplementationUsingLinkedlist {

    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head; 

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackImplementationUsingLinkedlist st = new StackImplementationUsingLinkedlist();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Popped element is: " + st.pop());
        System.out.println("Peek element is: " + st.peek());
        st.print();
    }
}
