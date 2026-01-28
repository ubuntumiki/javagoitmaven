package core.com.module_07;

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float count = 0;
        String[] arrStr = phrase.toLowerCase().split(" ");
        String wordNew = word.toLowerCase();
        for (String w : arrStr) {
            if (w.equals(wordNew)) {
                count++;
            }
        }
        return count / arrStr.length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}