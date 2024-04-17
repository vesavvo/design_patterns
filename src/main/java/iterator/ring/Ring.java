package iterator.ring;// Ring.java
import java.util.Iterator;

public class Ring implements Iterable<Integer>, SimpleCollection {
    private Node head;
    private Node tail;

    public Ring() {
        this.head = null;
        this.tail = null;
    }

    public void add(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            // first element
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RingIterator(head);
    }
}
