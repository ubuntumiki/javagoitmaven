package core.com.module_07;

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        String sourceWordLower = sourceWord.toLowerCase();
        String targetWordLower = targetWord.toLowerCase();

        char[] target = targetWordLower.toCharArray();

        for (char c : target) {
            if (sourceWordLower.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}