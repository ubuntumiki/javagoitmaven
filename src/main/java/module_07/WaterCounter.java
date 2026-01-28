package core.com.module_07;

class WaterCounter {
    public double count(String text) {
        char[] textToChar = text.toCharArray();
        int countChar = textToChar.length;
        int spaceCount = 0;
        for (char c : textToChar) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        return (double) spaceCount / countChar;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}