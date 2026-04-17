package Day21;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
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

    // Delete node by value
    public void delete(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            return;
        }

        // Search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key not found
        if (temp == null) return;

        // Unlink the node
        prev.next = temp.next;
    }

    // Traverse and print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDeletion {
    public static void main(String[] args){
      
        LinkedList list = new LinkedList();

        // Insert elements
        int[] elements = {10, 20, 30, 40, 50};
        for (int el : elements) {
            list.insert(el);
        }

        System.out.println("Original List:");
        list.printList();

        // Delete node with value 30
        list.delete(30);

        System.out.println("List after deleting 30:");
        list.printList();
    }
}
