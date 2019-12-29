import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyLinkedList {

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val){
            this.value = val;
        }

        // Вывод всего списка

        public void displayNode() {
             System.out.print(value + " ");
        }
    }

    public Node first = null;
    public Node last = null;
    public Node tempForReplace = null;
    private int size = 0;

    public void addFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = null;
        newNode.prev = null;
        System.out.println("Добавление " + val + " в начало списка");
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }
        else{
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
        }
        size ++;
    }

    public void printSize(){
        System.out.println("Всего элементов в списке " + size);
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        System.out.println("Добавление " + val + " в конец списка");
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

    public void addBetween(int val, int place) {
        Node newNode = new Node(val);
        Node temp = first;
        System.out.println("Добавление " + val + " в позицию " + place);
        int i = 0;
        if (isEmpty()) {
            first = temp;
            last = temp;
        }
        else{
            while (temp != null) {
                if (i == place-1) {
                    temp.next.prev = newNode;
                    newNode.next = temp.next.next.prev;
                    temp.next = newNode;
                    newNode.prev = temp;
                }
                temp = temp.next;
                i ++;
            }
        }
        size++;
    }

    public void sortList(String how) {
        Node temp = first;
        boolean still = false;
        int tempInt = 0;
        System.out.println("Сортировка к " + how);
        do {
            if (temp.value < temp.next.value && how.equals("min") || temp.value > temp.next.value && how.equals("max")) {
                //Сортировка по значению к мин.
                tempInt = temp.value;
                temp.value = temp.next.value;
                temp.next.value = tempInt;
               still = true;
            }
            if (still) {
                temp = first;
                still = false;
                tempInt = 0;
            }
            else {
                temp = temp.next;
                tempInt ++;
            }
        }
        while (temp != last);
    }


    public void removePosition(int place) {
        Node temp = first;
        int i = 0;
        while (temp != null) {
            if (i== place) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                System.out.println("Удалено " + temp.value + " в позиции " + place);
            }
            temp = temp.next;
            i ++;
        }
        size --;
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
        System.out.print( " | эл-тов " + size);
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
            System.out.println("С начала(списка) удалено " + temp.value);
        }
        size --;
    }

    public void removeLast() {
        Node temp = last;
        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println("С конца удалено " + temp.value);
        size --;
    }
}