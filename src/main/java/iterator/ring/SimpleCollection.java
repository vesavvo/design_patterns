package iterator.ring;

import java.util.Iterator;

public interface SimpleCollection {
    void add(Integer element);

    Iterator<Integer> iterator();
}
