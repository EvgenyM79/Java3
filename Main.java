public class Main {

    public static void main(String[] args) {
        MyLinkedList newList = new MyLinkedList();
        for (int i = 0 ; i < 10; i++ ){
            if (i%2==0)
                newList.addFirst((double)(i +2) * i + 1);
            else
                newList.addLast((double)(i +2) * i + 1);
            newList.displayList();
        }
        newList.printSize();
        System.out.println("Min = " + newList.howElement("min"));
        System.out.println("Max = " + newList.howElement("max"));
        newList.sortList("min");
        newList.displayList();
        newList.addBetween(99.0,3);
        newList.displayList();
        newList.sortList("max");
        newList.displayList();
        newList.removePosition(5);
        newList.displayList();
        for (int i = 0 ; i < 5; i++ ){
            if (i%2==0)
                newList.removeFirst();
            else
                newList.removeLast();
            newList.displayList();
        }
        newList.addAll(9.0);
    }

}