package core.com.module_07;

class UniqueCharCounter {
    public int count(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }

        int count = 0;
        boolean[] seen = new boolean[65536];

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (!seen[c]) {
                seen[c] = true;
                count++;
            }
        }

        return count;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}