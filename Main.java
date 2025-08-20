class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the pointer
            prev = current;      // Move prev to current
            current = next;      // Move to the next node
        }
        head = prev; // Update head
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Create a loop for testing
        // list.head.next.next.next.next = list.head.next; // Creates a loop

        // Detect loop
        printlist(list);
    }

    private static void printlist(SinglyLinkedList list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printlist'");
    }
}

