package core.com.module_07;

class DigitText {
    public boolean detect(String text) {
        if (text == null) return false;
        char[] ch = text.toCharArray();
        for (char c : ch) {
            if (!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}