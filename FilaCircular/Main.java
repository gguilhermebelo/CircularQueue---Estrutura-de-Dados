
public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Fila cheia? " + queue.isFull());
        System.out.println("Fila vazia? " + queue.isEmpty());

        System.out.println("Removendo: " + queue.remove());
        System.out.println("Removendo: " + queue.remove());
        System.out.println("Removendo: " + queue.remove());
        System.out.println("Fila cheia? " + queue.isFull());

        queue.add(6);
        queue.add(7);
        queue.add(8);
        System.out.println("Fila cheia? " + queue.isFull());

        queue.clear();
        System.out.println("Fila limpa");
        System.out.println("Fila vazia? " + queue.isEmpty());
    }
}
