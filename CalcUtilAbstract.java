public abstract class CalcUtilAbstract {

    //public static final class Math extends Object;
    //В строке выражения вычисляет sqrt, sin, cos. tan и возвращает в выражение елемент с готовым результатом
    public static String[] itogExpert(String[] masForCalk){
        for (int i = 0; i < masForCalk.length; i += 2){
            if (!isNumeric(masForCalk[i])){
                //System.out.println(masForCalk[i].split("[(0-9)]+")[0]);
                System.out.print(masForCalk[i] + "=");
                if ((masForCalk[i].split("[(0-9)]+")[0]).equals("sqrt"))
                    masForCalk[i] = String.valueOf(Math.sqrt(Double.valueOf(masForCalk[i].split("[(a-zA-Z)]+")[1])));
                if ((masForCalk[i].split("[(0-9)]+")[0]).equals("sin"))
                    masForCalk[i] = String.valueOf(Math.sin(Double.valueOf(masForCalk[i].split("[(a-zA-Z)]+")[1])));
                if ((masForCalk[i].split("[(0-9)]+")[0]).equals("cos"))
                    masForCalk[i] = String.valueOf(Math.cos(Double.valueOf(masForCalk[i].split("[(a-zA-Z)]+")[1])));
                if ((masForCalk[i].split("[(0-9)]+")[0]).equals("tan"))
                    masForCalk[i] = String.valueOf(Math.tan(Double.valueOf(masForCalk[i].split("[(a-zA-Z)]+")[1])));
                System.out.println(masForCalk[i]);

            }
        }
        return  masForCalk;
    }

    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.valueOf(strNum);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
