package core.com.module_07;

class WordDeleter {

    public String remove(String phrase, String[] words) {
        String[] strArr = phrase.split(" ");
        StringBuilder strNew = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            boolean shouldDelete = false;
            for (int j = 0; j < words.length; j++) {
                if (strArr[i].equals(words[j])) {
                    shouldDelete = true;
                }
            }
            if (!shouldDelete) {
                if (strNew.length() > 0){
                    strNew.append(" ");
                }
                strNew.append(strArr[i]);
            }
        }

        return strNew.toString();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}