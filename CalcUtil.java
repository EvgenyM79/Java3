public class CalcUtil extends CalcUtilAbstract {

    public Double calkresult(String stroka){
        String[] masForCalk = stroka.split(" ");
        masForCalk = CalcUtilAbstract.itogExpert(masForCalk);
        int num = masForCalk.length;
        byte[] howCalk = new byte[num]; // массив, который показывает, очередь вычислений.
        double[] forLong = new double[num]; // массив чисел и знаков
        for (int i = 0; i < num; i += 2 ){
            forLong[i] = Double.valueOf(masForCalk[i]);
        }
        for (int i = 1; i < num; i += 2 ){
            if (masForCalk[i].equals("*")  || masForCalk[i].equals("/")) {
                howCalk[i] = 1;
            }
            else {
                howCalk[i] = 2;
            }
        }
        for (int i = 1; i < num; i +=2 ) {
            if (howCalk[i] == 1) {
                if (masForCalk[i].equals("*")) {
                    forLong[i + 1] = forLong[i - 1] * forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
                if (masForCalk[i].equals("/")) {
                    forLong[i + 1] = forLong[i - 1] / forLong[i + 1];
                    forLong[i - 1] = 0;
                    //howCalk[i] = 0;
                }
            }
        }
        for (int i = 1; i < num; i +=2 ){
            if (howCalk[i] == 2 && masForCalk[i].equals("+")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] + forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
            if (howCalk[i] == 2 && masForCalk[i].equals("-")) {
                for (int j = i; j < num; j += 2) {
                    if (forLong[j + 1] != 0){
                        forLong[j + 1] = forLong[i - 1] - forLong[j + 1];
                        //forLong[i - 1] = 0;
                        //howCalk[i] = 0;
                        break;
                    }
                }
            }
        }
        return forLong[num-1];
    }
}
