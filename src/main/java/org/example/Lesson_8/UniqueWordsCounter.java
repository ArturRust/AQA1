package org.example.Lesson_8;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "pear", "apple", "orange", "grape", "pineapple", "kiwi", "banana", "pear"};
        Map<String,Integer> wordCount = new HashMap<>();
        for (String word: words){
            if (!wordCount.containsKey(word)){
                wordCount.put(word,1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word,count +1);
            }
        }
        System.out.println("Уникальные слова и количество их вхождений:");
        for (String word:wordCount.keySet()){
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
        int uniqueWordsCount = wordCount.keySet().size();
        System.out.println("Количество уникальных слов: " + uniqueWordsCount);
    }
}
