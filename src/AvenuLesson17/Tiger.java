package AvenuLesson17;

public class Tiger {
    private int age;
    private int cost;
    private String name;
    private String poroda;

    public Tiger(){

    }

    public Tiger(int age, int cost, String name, String poroda) {
        this.age = age;
        this.cost = cost;
        this.name = name;
        this.poroda = poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
