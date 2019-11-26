import java.util.ArrayList;
import java.util.Iterator;

public class Main {

public static Integer generateInt(){
    return (int) (Math.random()*5);
}
    public static void main(String[] args) {
        ArrayList<ClassUser> listExample = new ArrayList<>();
        String[] fam = new String[]{"Иванов", "Петров", "Сидоров", "Сорокин", "Свистунов"};
        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий"};
        //int count = 0;
        boolean t = true;
        int nName = 0, nFam = 0;
        while (t){
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {}
            nName = generateInt();
            //System.out.println(nName);
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {}
            nFam = generateInt();
            System.out.println(nName + " " + nFam);
            ClassUser user = new ClassUser(name[nName], fam[nFam]);
            System.out.println(user.name + " " + user.fam);
            if (!listExample.contains(user)) {
                listExample.add(user);
            }
            else {
                t = false;
            }
         }
    }
}
