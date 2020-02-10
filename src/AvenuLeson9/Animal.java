package AvenuLeson9;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private int price;
    private String name;
    private String mgkf;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMgkf() {
        return mgkf;
    }

    public void setMgkf(String mgkf) {
        this.mgkf = mgkf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                getPrice() == animal.getPrice() &&
                Objects.equals(getName(), animal.getName()) &&
                Objects.equals(getMgkf(), animal.getMgkf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getPrice(), getName(), getMgkf());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", mgkf='" + mgkf + '\'' +
                '}';
    }
    public abstract void  voice();
}
