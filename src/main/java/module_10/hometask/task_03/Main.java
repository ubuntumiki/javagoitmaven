package core.com.module_10.hometask.task_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> freq = countWords(new File("src/core/com/module_10/hometask/task_03/words.txt"));

        List<String> words = new ArrayList<>(freq.keySet());

        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = 0; j < words.size() - 1 - i; j++) {
                String w1 = words.get(j);
                String w2 = words.get(j + 1);

                int count1 = freq.get(w1);
                int count2 = freq.get(w2);

                if (count2 > count1) {
                    words.set(j, w2);
                    words.set(j + 1, w1);
                }
            }
        }

        for (String w : words) {
            System.out.println(w + " " + freq.get(w));
        }
    }

    public static Map<String, Integer> countWords(File file) throws IOException {
        Map<String, Integer> freq = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                for (String w : words) {
                    if (w.isEmpty()) {
                        continue;
                    }

                    if (freq.containsKey(w)) {
                        int oldValue = freq.get(w);
                        freq.put(w, oldValue + 1);
                    } else {
                        freq.put(w, 1);
                    }
                }
            }
        }

        return freq;
    }
}
