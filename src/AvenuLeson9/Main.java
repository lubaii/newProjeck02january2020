package AvenuLeson9;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); нельзя создать

        Tiger tiger = new Tiger();
        tiger.setName("Миша");

        Tiger tiger1 = new Tiger();
        tiger1.setName("Таня");

        Monkey monkey1 = new Monkey();
        monkey1.setName("Клава");

        Monkey monkey2 = new Monkey();
        monkey2.setName("Петрович");

        Animal[] animals = new Animal[4];
        animals[0]=tiger;
        animals[1]=tiger1;
        animals[2]=monkey1;
        animals[3]=monkey2;

        for( int i = 0;i<animals.length;i++){
            animals[i].voice();
        }

    }


}
