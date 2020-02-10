package HashSetLuba;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       // HashSet<String> texts = new HashSet<>();
        //LinkedHashSet<String> texts = new LinkedHashSet<>();
        //TreeSet<String> texts = new TreeSet<>();
        TreeSet<Integer> texts = new TreeSet<>(); // copmareTo
        texts.add(8);
        texts.add(8);

        texts.add(3);
        texts.add(4);
        texts.add(5);
//        texts.add("1kjlhlkjh");
//        texts.add("2Люба");
//        texts.add("3Ира");
//        texts.add("4Лидия");
//        texts.add("5 Миша");
//        texts.add("5 Миша");
//        texts.add("5 Миша");
//        texts.add("5 Миша");
        System.out.println(texts);

    }
}
