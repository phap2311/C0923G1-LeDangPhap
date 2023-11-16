package ss10_dsa_danh_sach.list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPCITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPCITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < size; i++) {
            elements[i] = null;

        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;

    }

    public void add(E element, int index) {
        if (index > size) {
            throw new IllegalArgumentException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[size] == null) {
            add(element);
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;

        }
    }

    public E get(int index) {

        if (index < size && index >= 0) {
            return (E) elements[index];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);

        }

    }
}
