public class CircularQueue {
    private int top = -1;
    private int base = 0;
    private int[] data;

    private int size;

    CircularQueue(int size) {
        this.data = new int[size];
        size=0;
    }

    public void add(int date) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        }
        top = (top + 1) % data.length;
        data[top] = date;
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int removedElement = data[base];
        data[base] = 0;
        base = (base + 1) % data.length;
        size--;
        return removedElement;
    }

    public void clear() {
        top = -1;
        base = 0;
    }

    public boolean isFull() {
//        return (top + 1) % data.length == base;
        return (size == data.length);
    }

    public boolean isEmpty() {
        //        return top == base - 1 || (top == data.length - 1 && base == 0);
        return (size == 0);
    }

    private int move(int position) {
        return (base + position) % data.length;
    }
}
