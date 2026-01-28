package core.com.module_05;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int remaining = count;
        StringBuilder sb = new StringBuilder();

        // 1000 зірок — X
        int thousands = remaining / 1000;
        for (int i = 0; i < thousands; i++) {
            sb.append('X');
        }
        remaining %= 1000;

        // 100 зірок — Y
        int hundreds = remaining / 100;
        for (int i = 0; i < hundreds; i++) {
            sb.append('Y');
        }
        remaining %= 100;

        // 10 зірок — Z
        int tens = remaining / 10;
        for (int i = 0; i < tens; i++) {
            sb.append('Z');
        }
        remaining %= 10;

        // 1 зірка — *
        for (int i = 0; i < remaining; i++) {
            sb.append('*');
        }

        return sb.toString();
    }
}
