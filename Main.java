import java.util.ArrayList;
import java.util.Iterator;

public class Main {


public static Integer generateInt(){
    return (int) (Math.random()*3);
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
            nName = generateInt();
            System.out.println(nName);
            nFam = generateInt();
            System.out.println(nFam);
            ClassUser user = new ClassUser(name[nName], fam[nFam]);
            System.out.print(user.name + " " + user.fam);
            if (!listExample.contains(user)) {
                listExample.add(user);
            }
            else {
                t = false;
            }
            //listExample.add(user);
            //System.out.println(user.name + " " + user.fam);
                 /*   if (listExample.get(i).equals(user)) {
                        System.out.println(listExample.get(i).name + " list " + listExample.get(i).fam);
                        System.out.print(user.name + " =list " + user.fam);
                        t = false;
                    } else {
                        listExample.add(user);
                        System.out.println(user.name + " + " + user.fam);
                        count ++;
                    }
                    //listExample.add(user);
                    //System.out.println(listExample.get(count).name + " " + listExample.get(count).fam);
                }
            }
            else {
                listExample.add(user);
                System.out.println(user.name + " + " + user.fam);
                count ++;
                  */
         }
    }
}
