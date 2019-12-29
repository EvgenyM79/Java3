public class Main {

    public static void main(String[] args) throws Exception {
        CalcUtil result = new CalcUtil();
        MyLinkedList newListStroka = new MyLinkedList(5);
        MyLinkedList newListItog = new MyLinkedList(5);
        String[] newStroka = new String[9];
        newStroka[0] = "25 + 8 * 5 * 3 / 4 - 4 * 2 / 8";
        newStroka[1] = "32 + 3 * 5 * 3 / 4 - 40 * 2 / 2";
        newStroka[2] = "34 + 2 * 5 * 3 / cos(25) - 10 * 2 / 4";
        newStroka[3] = "67 + 8.3 * 2 * 3 / 4 - 32 * 2 / 4";
        newStroka[4] = "87 + 8 * sin(75) * 3 / 4 - 54 * 2 / 9";
        newStroka[5] = "25 + 4 * 5 * 3 / 4 - 68 * 2 / 4";
        newStroka[6] = "54 + 8 * tan(50) * 3 / 4 - 78 * 2 / 7";
        newStroka[7]= "47 + 8 * 5 * 3 / 4 - 6 * 2 / 3";
        newStroka[8]= "35 + 8 * 5 * 3 / 4 - 8 * 2 / sqrt(12)";
        for (int i = 0; i < 9; i ++ ) {
            System.out.print(newStroka[i]);
            newListStroka.addLast(newStroka[i]);
            newListStroka.displayLast();
            newListItog.addLast(result.calkresult(newStroka[i]));
            newListItog.displayLast();
            if (i > 3) {
                System.out.println("Массив выражений = 5");
                newListStroka.displayList();
                System.out.println("Массив результатов = 5");
                newListItog.displayList();
            }
        }
        System.out.println("Полная очистка массив выражений и результатов");
        newListStroka.removeAll();
        newListItog.removeAll();

    }
}
