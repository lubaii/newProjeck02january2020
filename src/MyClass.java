public class MyClass {
    public static void main(String[] args) {
        C obj= new C(10,20,30);
        System.out.println("A.x ="+ obj.x +"; B.y ="+ obj.x +"; C.z = "+ obj.z);

        A a = new A(53);
        System.out.println(a.x);

        B b = new B(35,8);
        System.out.println(b.x +""+ b.y);

       // C c = new C(1,2,3);
        //System.out.println(c.x+""+c.y+""+c.z);
    }

}
class A{
    public int x;
    public A(int x){
        this.x = x;
        System.out.println("A.A()");
    }

}
class B extends A{
public  int y;
    public B(int x,int y) {
        super(x);
        this.y = y;
        System.out.println("B.B()");
    }

}
class C extends B {
    public int z;
    public C(int x,int y, int z) {
        super(x,y);
        this.z=z;
        System.out.println("C.C()");
    }
}
