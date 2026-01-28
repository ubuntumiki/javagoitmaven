package core.com.module_07;

class AvgWordLength {
    public double count(String phrase) {
        String[] strArr = phrase.split(" ");
        int totalLen = 0;
        for (String w : strArr) {
            totalLen += w.length();
        }

        return (double) totalLen / strArr.length;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
