package core.com.module_07;

class EmailDetector {
    public boolean isPresent(String text) {
        if (text == null) return false;

        int pos = text.indexOf('@');
        while (pos != -1) {
            if (pos >= 2 && pos <= text.length() - 3) {
                if (text.charAt(pos - 1) != ' ' &&
                        text.charAt(pos - 2) != ' ' &&
                        text.charAt(pos + 1) != ' ' &&
                        text.charAt(pos + 2) != ' ') {
                    return true;
                }
            }
            pos = text.indexOf('@', pos + 1);
        }

        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}