public abstract class Calculator{

    public static class Calc extends Calculator {
        private double value;
        private Calc[] itog;

        public Calc(double val){
            this.value = val;
        }

        // Вывод всего списка
        public void displayItog() {
            System.out.println(value + " " );
            //User.hello(100, 23);
            //User.calculate(12);

        }
    }

    public interface Expert{
        static void showSqrt(double a){
            System.out.println("Корень квадратный от числа " + a + " равен " + calculateSqrt(a));
        }

        static double calculateSqrt(double a) {
            return Math.sqrt(a);
        }

        static void showSqr(double a, double b){
            System.out.println("Возвести " + a + " в степень " + b + " = " + calculateSqr(a,b));
        }

        static double calculateSqr(double a, double b) {
            return Math.pow(a,b);
        }

    }
}
