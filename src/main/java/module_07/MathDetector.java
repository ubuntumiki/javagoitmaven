package core.com.module_07;

class MathDetector {
    public boolean isMath(String text) {
        if (text == null) return false;
        boolean countEq = false;
        boolean countOper = false;
        int countDig = 0;
        char[] ch = text.toCharArray();
        for (char c : ch) {
            if (c == '=') {
                countEq = true;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                countOper = true;
            }
            if (Character.isDigit(c)) {
                countDig++;
            }
            if (countEq && countOper && countDig >= 2) {
                return true;
            }
        }

        return false;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}