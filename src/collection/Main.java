package collection;

import java.util.*;


//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать сколько раз встречается каждое слово.

//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
//        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.

//        Желательно как можно меньше добавлять своего, чего нет в задании
//        (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
//        делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
//        тестировать просто из метода main() прописывая add() и get().

public class Main {


    public static void main(String[] args) {
        String[] texts = {"hello", "people", "hi", "city", "city", "hello", "car", "green", "city", "people", "voice", "hi", "bay", "welcome", "ocean"};

        HashMap<String, Integer> word = new HashMap<>();
        for (String x : texts) {
            word.put(x, word.getOrDefault(x, 0) + 1);
        }
        System.out.println(word);


        Phonebook book = new Phonebook();
        book.addContact("Tolya", "988987897987");
        book.addContact("Marina", "2526526");
        book.addContact("Kolya", "523423423");
        book.addContact("Tolya", "8234234");
        book.addContact("Evgeniya", "842523567");
        book.addContact("Evgeniya", "8564456453");


        book.findAndPrint("Tolya");
        book.findAndPrint("Evgeniya");
        book.findAndPrint("Kolya");

    }


}


