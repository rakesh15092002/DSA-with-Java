package LinkList;

public class AddNodeInMultiplePosition {
    class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // add at last

    public void addAtLast(int data) {
    Node newNode = new Node(data);
    // If the list is empty, make the new node the head
    if (head == null) {
        head = newNode;
        return;
    }
    // Traverse to the end of the list
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    // Add the new node at the end
    temp.next = newNode;
}

// add at begin
 public void addAtBegining(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
 }

//  add node after bode middle
public void addAtAfterNode(int data,int insertAfterThisNode){
    Node newNode = new Node(data);
    if(head == null){
       System.out.println("list are empty");
         return;
    }
    Node temp = head;
    while ( temp!=null&&temp.data!= insertAfterThisNode ) {
        temp = temp.next;
    }
    if(temp!=null){
        newNode.next = temp.next;
        temp.next = newNode;

    }
    else{
        System.out.println("node not found");
    }
}

// printing the list
    public void printing(){
        Node temp = head;
        while(temp!= null ){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
public static void main(String[] args) {
    AddNodeInMultiplePosition list = new AddNodeInMultiplePosition();
    list.addAtLast(1);
    list.addAtLast(2);
    list.addAtLast(3);
    list.addAtLast(4);
    // list.printing();
    // list.addAtBegining(5);
    list.addAtAfterNode(8, 2);
    list.printing();
}



}
