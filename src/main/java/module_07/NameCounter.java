package core.com.module_07;

class NameCounter {
    public int count(String text) {
        String[] strArr = text.split(" ");
        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            String w = strArr[i];

            if (w.length() < 2) continue;
            if (!Character.isUpperCase(w.charAt(0))) continue;

            boolean ok = true;
            for (int j = 1; j < w.length(); j++) {
                if (!Character.isLowerCase(w.charAt(j))) {
                    ok = false;
                    break;
                }
            }

            if (ok) count++;
        }

        return count;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}