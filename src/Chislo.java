import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chislo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Boolean read = bufferedReader.ready();
        System.out.println("Введите число");
        while (true){
            int i = bufferedReader.read();
            if(i%2==0&&i/i==1){
                System.out.println("Число не является простыи");
            } else {
                System.out.println("Простое число");
            } break;
        }
    }
}
