public class MyLinkedList {

    public class Node {
        private Object value;
        private Node next;
        private Node prev;

        public Node(Object val){
            this.value = val;
        }

        // Вывод всего списка

        public void displayNode() {
            if (value.equals(last.toString()))
                System.out.print(value);
            else
                System.out.print(value + ", ");
        }

        public String toString(){
            return String.valueOf(value);
        }
    }

    public Node first = null;
    public Node last = null;
    //public Node tempForReplace = null;
    private int maxsize, size = 0;

    public MyLinkedList(int maxsize){
        this.maxsize = maxsize;
    }

    public void addLast(Object val) {
        Node newNode = new Node(val);
        if (size == maxsize){
            removeFirst();
        }
        if (isEmpty()) {
            first = newNode;
            last = newNode;

        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size ++;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        Node temp = first;
        while (temp != null) {
            temp.displayNode();
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayLast(){
        System.out.println(" Последнее выражкение: " + last.toString());
    }

    public void  removeAll(){
        Node temp = first;
        while (temp != null) {
            if (!isEmpty()) {
                if (first.next == null) {
                    first = null;
                    last = null;
                } else {
                    first = first.next;
                    first.prev = null;
                }
                System.out.println("С начала(очереди) удалено " + temp.value);
            }
            size --;
            temp = first;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first;
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println("С начала(очереди) удалено " + temp.value);
        }
        size --;
    }
}