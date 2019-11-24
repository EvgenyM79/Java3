public class Main {

    public static void main(String[] args) {
        Calculator.Calc calc1 = new Calculator.Calc(49);
        calc1.displayItog();
        Calculator.Expert.showSqrt(23);
        Calculator.Expert.showPow(2,5);
        Calculator.Calc.Calc.Calc.Calc.Calc.Expert.showPow(3,3);
        System.out.println("Корень квадратный от числа " + 81 + " равен " + Calculator.Calc.Expert.calculateSqrt(81));
    }
}