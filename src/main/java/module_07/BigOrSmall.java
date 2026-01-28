package core.com.module_07;

class BigOrSmall {
    public String calculate(String text) {
        int countSmall = 0;
        int countBig = 0;
        char[] ch = text.toCharArray();
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                countBig++;
            } else {
                countSmall++;
            }
        }
        
        if (countBig > countSmall) {
            return "Big";
        } else if (countSmall > countBig) {
            return  "Small";
        } else {
            return "Same";
        }
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}