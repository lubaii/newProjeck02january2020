package HashSetLuba;

import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String,Integer> holodilnik = new HashMap<>();
        holodilnik.put("Яблоко",5);
        holodilnik.put("Мандарин",15);
        holodilnik.put("Масло",1);
        holodilnik.put("Рыба",6);
        System.out.println(holodilnik);

        int summa = 0;
//        for(String currentProdukt:holodilnik.keySet()){
//            summa=summa+holodilnik.get(currentProdukt);
//
//        }
        for(Integer currentProdukt:holodilnik.values()){
            summa=summa+holodilnik.get(currentProdukt);

        }
        System.out.println(summa);

        holodilnik.put("Яблоко",3+holodilnik.get("Яблоко"));
        System.out.println(holodilnik);

        System.out.println(holodilnik.values());

    }
}
