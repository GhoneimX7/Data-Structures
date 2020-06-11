package ls;

public class LinkedList {

    Node head;
    private int size = 1;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node newNode) { // adding at the first
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(int index, Node newNode) { // adding in between
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        int i = 0;
        Node l = null;
        Node temp = head;
        while (i != index) {
            l = temp;
            temp = temp.next;
            i++;
        }
        l.next = newNode;
        newNode.next = temp;
        size++;
    }

    public void delete() {  //delet from the first
        head = head.next;
        size--;
    }

    public void delete(int index) { // delete in between
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        int i = 0;
        Node temp = head;
        Node l = null;
        Node n = null;
        while (i != index) {
            if (i == index - 1) {
                l = temp;
            }
            i++;
            temp = temp.next;
        }
        n = temp.next;
        l.next = n;
        size--;
    }

    public void display() {     //print the linked list
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void display(int index) {     //print a certain index
        if (index == 0) {
            System.out.println(head.value);
        } else {
            int i = 0;
            Node temp = head;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            System.out.println(temp.value);
        }
    }

    public int Size() {     //getting the linked list length
        return size;
    }
}
