package iterator.ring;
import java.util.Iterator;

public class RingIterator implements Iterator<Integer> {
    private Node current;
    private Node start; // To remember the starting node

    public RingIterator(Node start) {
        this.current = start;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int data = current.getData();
        current = current.getNext();
        return data;
    }
}
