public abstract class Calculator{

    public static class Calc extends Calculator {
        private double value;
        //private Calc[] itog;

        public Calc(double val){
            this.value = val;
        }

        public void displayItog() {
            System.out.println("Корень квадратный от числа " + value + " равен " + Expert.calculateSqrt(value));
        }
    }

    public interface Expert{
        static void showSqrt(double a){
            System.out.println("Корень квадратный от числа " + a + " равен " + calculateSqrt(a));
        }

        static double calculateSqrt(double a) {
            return Math.sqrt(a);
        }

        static void showPow(double a, double b){
            System.out.println("Возвести " + a + " в степень " + b + " = " + calculatePow(a,b));
        }

        static double calculatePow(double a, double b) {
            return Math.pow(a,b);
        }

    }
}
