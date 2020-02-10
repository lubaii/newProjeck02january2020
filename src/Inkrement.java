public class Inkrement {
    public static void main(String[] args) {
        int i = 2;
        int resultat =10;



        System.out.print("10 / 2 = 5, сохраняем 5 в result = ");
        System.out.println(resultat/=i);
        System.out.print("5 * 2 = 10, сохраняем 10 в result = ");
        System.out.println(resultat*=i);
        resultat++;
        System.out.print("(resultat++) resultat = resultat+1; получаем ");
        System.out.println(resultat);
        System.out.print("(++resultat) resultat = resultat+1; полуаем " );
        System.out.println(++resultat);

        System.out.print("Если resultat++ прописывается в System.out.println, сначала печатается resultat, после проходит операция result++   ");
        System.out.println(resultat++);
        System.out.print("В итоге переменная resultat сохраняет в себе значение  ");
        System.out.println(resultat);

    }
}
