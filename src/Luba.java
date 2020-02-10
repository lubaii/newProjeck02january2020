public class Luba {
    String name;
    int age;

    public Luba(String name,int age){
        this.name = name;
        this.age = age;

    }

    public Luba() {
        System.out.println(" пусто");
    }

    public static void main(String[] args){
        Luba one = new Luba("Luba",32);
        System.out.println(one.name);
        System.out.println(one.age);
        Luba twu = new Luba();

        System.out.println("Привет 2020");
        String s = new String("5");
        String s1 = new String("5");
        System.out.println(s.equals(s1));

    }
}
