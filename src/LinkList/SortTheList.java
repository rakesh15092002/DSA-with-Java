package LinkList;

public class SortTheList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add node at end
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print the list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Merge Sort on Linked List
    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = sortList(head);
        Node right = sortList(rightHead);

        return merge(left, right);
    }

    // Find middle node
    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    private Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        temp.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Helper method to start sort
    public void sort() {
        head = sortList(head);
    }

    // Main method for testing
    public static void main(String[] args) {
        SortTheList list = new SortTheList();
        list.addNode(4);
        list.addNode(2);
        list.addNode(1);
        list.addNode(3);
        System.out.println("Before sorting:");
        list.print();
        list.sort();
        System.out.println("After sorting:");
        list.print();
    }
}
