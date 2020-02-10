public class Avenu {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("getAge "+person.getAge());

        try {
            person.setAge(19);
            System.out.println("Успех");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Неверный возраст");
        }
        System.out.println("getAge2 "+person.getAge());
        System.out.println("Конец");
    }
}
