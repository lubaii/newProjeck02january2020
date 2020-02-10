package PolimorfLuba;

public class Danser {
    private int age;
    private  String name;

    public Danser() {
    }

    public Danser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public void danse(){
         System.out.println("Tанцуют все!!!");
     }
    @Override
    public String toString() {
        return "Danser{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
