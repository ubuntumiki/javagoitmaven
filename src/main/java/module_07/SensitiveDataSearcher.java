package core.com.module_07;

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        phrase = phrase.toLowerCase();
        String[] arr = phrase.split("[^A-Za-z0-9]+");
        for (String w : arr) {
            if (w.equals("pass") || w.equals("key") || w.equals("login") || w.equals("email")){
                return true;
            }
        }

        return false;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}