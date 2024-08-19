public class CircularQueue {
    private int top = -1;
    private int base = 0;
    private int[] data;

    CircularQueue(int size) {
        this.data = new int[size];
    }

    public void add(int date) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        }
        top = (top + 1) % data.length;
        data[top] = date;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int removedElement = data[base];
        base = (base + 1) % data.length;
        return removedElement;
    }

    public void clear() {
        top = -1;
        base = 0;
    }

    public boolean isFull() {
        return (top + 1) % data.length == base;
    }

    public boolean isEmpty() {
        return top == base - 1 || (top == data.length - 1 && base == 0);
    }

    private int move(int position) {
        return (base + position) % data.length;
    }
}
