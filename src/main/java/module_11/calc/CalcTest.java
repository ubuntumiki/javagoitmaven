package module_11.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.calc(2, 3, (a, b) -> a + b);

        int sub = calculator.calc(5, 4, (a, b) -> a - b);

        System.out.println(sum);
        System.out.println(sub);
    }
}
