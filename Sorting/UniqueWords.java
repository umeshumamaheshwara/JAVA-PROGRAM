package Sorting;

// WAP to print unique words in a given sentence (case-insensitive)

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String str = "Java is a programming language and python also a programming Language";

        
        String[] st1 = str.toLowerCase().split(" ");

       
        for (String word : st1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

       
        System.out.print("Unique words (case-insensitive): ");
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
