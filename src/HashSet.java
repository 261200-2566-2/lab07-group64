import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;


public class HashSet <E> implements Set<E> {

    private static final Object DUMMY = new Object();
    private final HashMap<E, Object> map;

    public HashSet() {
        map = new HashMap<>();
    }
    public HashSet(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    //all method detail : https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashSet.html
    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E element) {
        return map.put(element, DUMMY) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean stage = false;
        for (Object element : c) {
            if (remove(element)) {
                stage = true;
            }
        }
        return stage;
    }

    @Override
    public boolean retainAll(Collection<?> c) {

        boolean stage = false;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            if (!c.contains(iterator.next())) {
                iterator.remove();
                stage = true;
            }
        }
        return stage;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    @Override
    public String toString() {
        return map.keySet().toString();
    }
}