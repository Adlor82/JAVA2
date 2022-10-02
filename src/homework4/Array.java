package homework4;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Огурец");
        words.add("Арбуз");
        words.add("Яблоко");
        words.add("Груша");
        words.add("Капуста");
        words.add("Огурец");
        words.add("Груша");
        words.add("Банан");
        words.add("Апельсин");
        words.add("Арбуз");
        words.add("Перец");
        words.add("Баклажан");
        words.add("Яблоко");
        words.add("Клубника");
        words.add("Картофель");

        System.out.println("\nМассив содержит следующие слова " + words);

        Set<String> stringSet = new LinkedHashSet<>(words);
        System.out.println("\nМассив содержит уникальные слова: " + stringSet);

        HashMap<String, Integer> doubleWords = new HashMap<>();
        Integer doubleWord = null;
        for (String i : words) {
            doubleWord = doubleWords.get(i);
            doubleWords.put(i, doubleWord == null ? 1 : doubleWord + 1);
        }
        System.out.println("\nПовторяющиеся слова в массиве  " + doubleWords);
    }
}
