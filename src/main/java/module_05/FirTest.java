package core.com.module_05;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 120
        System.out.println(firTest.test(firNum, 5));

        System.out.println(new FirNumFactorial().calc(4));
        System.out.println(new FirNumFactorial().calc(0));

        System.out.println(new FirNumMultiplyOdd().calc(4));
        System.out.println(new FirNumMultiplyOdd().calc(5));

        System.out.println(new FirNumFizzBuzz().calc(20));

        System.out.println(new FirNumBasis().calc(9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int multiply = 1;
        for(int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                multiply *= i;
            }
        }
        return multiply;
    }
}

class FirNumFizzBuzz  extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0 || i % 3 != 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class FirNumBasis  extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum / 2;
    }
}