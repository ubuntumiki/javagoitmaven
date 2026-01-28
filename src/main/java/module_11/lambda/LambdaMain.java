package module_11.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        // (parameters) -> { body method }

//        Calculation calculation = new Calculation() {
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
        Calculation calculation = Integer::sum;

        int res = calculation.sum(2, 6);

        System.out.println(res);
    }
}
