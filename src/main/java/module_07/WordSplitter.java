package core.com.module_07;

import java.util.Arrays;

class WordSplitter {

    public String[] split(String phrase) {
        if (phrase == null || phrase.isBlank()) {
            return new String[0];
        }

        return phrase.trim()
                .toLowerCase()
                .split("\\s+");
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}