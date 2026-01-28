package core.com.module_07;

import java.util.Arrays;

public class ArrayCleaner {
    public String[] removeDuplicates(String[] items) {
        String[] uniqueItems = new String[items.length];
        int index = 0;

        for (String item : items) {
            if (!contains(uniqueItems, item)) {
                uniqueItems[index++] = item;
            }
        }

        return Arrays.copyOf(uniqueItems, index);
    }

    private boolean contains(String[] all, String element) {
        for (String item : all) {
            if (item == null) {
                continue;
            }

            if (item.equals(element)) {
                return true;
            }
        }

        return false;
    }
}
