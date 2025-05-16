package LinkList;

public class SearchElementinList {
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
    // seach element in list
    public boolean seachElement(int data){
        
        Node temp = head;
        while (temp != null && temp.data!= data ) {
            temp = temp.next;
        }
        if(temp == null){
            return false;
        }
         
        return true;
    }

    public static void main(String[] args) {
        SearchElementinList list = new SearchElementinList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        int target = 1;
        System.out.println(list.seachElement(target));
    }


}
