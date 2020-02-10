package HashSetLuba;

import java.util.HashSet;
import java.util.TreeSet;

public class Mian1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2,1980,5);
        Coin coin2 = new Coin(3,1986,5);
        Coin coin3 = new Coin(2,1999,2);
        Coin coin4 = new Coin(3,2000,1);
        Coin coin5 = new Coin(3,2000,1);

      // HashSet<Coin> coins= new HashSet<>();
       TreeSet<Coin> coins= new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
//        System.out.println(coins);

        for (Coin coin:coins){
            System.out.println(coin);
        }
    }
}

