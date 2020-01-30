public class DeletingNodeLinkedList {
    // Creating a class Node with 2 attribs: data and next
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Rep the head and tail of singly linked list
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to a list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Check if list is empty
        if (head == null) {
            // When the list is empty then head and tail will point to our new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail; so tail's next should point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    // deleteFromEnd will delete a node from end of the list
    public void deleteFromEnd() {
        // Check if list is empty
        if (head== null){
            System.out.println("List is empty");
            return;
        } else {
            //Check whether the list has only one item
            if (head!=tail){
                Node current = head;
                // Loop through the list till the second last element so current.next points at tail
                while(current.next!=tail) {
                    current = current.next;
                }
                // Second last elem is the new tail of the list
                tail = current;
                tail.next = null;
            }
            // If the list contains only one item then remove it and point both head and tail to null
            else {
                head = tail = null;
            }
        }
    }

    // display() will display all nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if(head==null) {
            System.out.println("List is empty");
            return;
        } while (current!=null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeletingNodeLinkedList deletingNodeLinkedList = new DeletingNodeLinkedList();

        // Adding data to the list
        deletingNodeLinkedList.addNode(1);
        deletingNodeLinkedList.addNode(2);
        deletingNodeLinkedList.addNode(3);
        deletingNodeLinkedList.addNode(4);

        // Print the original list
        System.out.println("Original list: ");
        deletingNodeLinkedList.display();

        //
        while(deletingNodeLinkedList.head != null) {
            deletingNodeLinkedList.deleteFromEnd();
            //Printing updated list
            System.out.println("Updated List: ");
            deletingNodeLinkedList.display();
        }
    }

}
