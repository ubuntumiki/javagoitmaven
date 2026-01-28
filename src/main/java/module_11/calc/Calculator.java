package module_11.calc;

public class Calculator {
    public int calc(int a, int b, Calculable calculable) {
        return calculable.calc(a, b);
    }
}
