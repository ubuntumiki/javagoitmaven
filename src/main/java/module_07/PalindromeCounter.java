package core.com.module_07;

class PalindromeCounter {
    public int count(String phrase) {
        int count = 0;
        String[] strArr = phrase.toLowerCase().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(new StringBuilder(strArr[i]).reverse().toString())) {
                count++;
            }
        }

        return count;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
