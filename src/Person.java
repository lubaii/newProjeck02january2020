public class Person {
    private int age;
    private  String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonAgeException {
    //public void setAge(int age) throws Exception {
        if(age<0||age>150){
            //throw new IllegalArgumentException("age<0||age>150");
            //throw new Exception("age<0||age>150");
            throw new PersonAgeException("age<0||age>150");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

