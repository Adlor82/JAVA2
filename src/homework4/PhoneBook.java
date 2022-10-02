package homework4;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", 92133366);
        phoneBook.add("Петров", 99955588);
        phoneBook.add("Сидоров", 49549522);
        phoneBook.add("Иванов", 812778855);
        phoneBook.add("Потапов", 812558866);
        phoneBook.add("Иванов", 911911911);


        phoneBook.get("Иванов");
    }

    HashMap<String, HashSet<Integer>> phoneBook1;
    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num);
        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.println("\nДля фамилии "+name+" найдены номера: "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
