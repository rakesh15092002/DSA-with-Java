package LinkList;

public class BasicsOfLinkedList {
   static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {
        // create a node
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        // put the data in the node
        first.data = 1;
        second.data = 2;
        third.data = 3;

        // connecting the node
        first.next = second;
        second.next = third;
        third.next = null;

        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    

}
