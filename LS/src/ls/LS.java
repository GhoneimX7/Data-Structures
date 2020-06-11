package ls;

public class LS {

    public static void main(String[] args) {
        LinkedList ls = new LinkedList(new Node(5, null));
        ls.add(new Node(52, null));
        ls.add(new Node(02, null));
        ls.add(new Node(16, null));
        ls.add(new Node(78, null));
        ls.display();
        System.out.println(ls.Size());
        ls.delete(4);
        ls.display();
        System.out.println(ls.Size());
        ls.add(0, new Node(12, null));
        ls.display();
        System.out.println(ls.Size());
        ls.delete(0);
        ls.display();
        System.out.println(ls.Size());
        ls.display(0);
    }

}
