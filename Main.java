public class Main {

    public static void main(String[] args) {
        MyLinkedList newList = new MyLinkedList();
        newList.addFirst(4);
        newList.displayList();
        newList.addLast(7);
        newList.displayList();
        newList.addFirst(15);
        newList.displayList();
        newList.addLast(25);
        newList.displayList();
        newList.addFirst(27);
        newList.displayList();
        newList.addLast(45);
        newList.displayList();
        newList.addFirst(19);
        newList.displayList();
        newList.addLast(12);
        newList.displayList();
        newList.sortList("min");
        newList.displayList();
        newList.addBetween(99,3);
        newList.displayList();
        newList.sortList("max");
        newList.displayList();
        newList.removePosition(5);
        newList.displayList();
        newList.removeFirst();
        newList.displayList();
        newList.removeLast();
        newList.displayList();
        newList.removeFirst();
        newList.displayList();
        newList.removeLast();
        newList.displayList();
    }

}