public class Child extends Super {


    public static void main(String[] args) {
        new Child().method();

    }

    @Override
    public void method() {
        super.method();
        System.out.println("chid");
    }
}
class Super{

    public  void  method(){ // если поставить finel будет ошибка компиляции из группы Ментор в ВК
        System.out.println("супер");
    }
}