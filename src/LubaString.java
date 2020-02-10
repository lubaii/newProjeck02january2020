import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LubaString {
    public static void main(String[] args) {
        String tout [][]={{"1","Италия","все включено","5 звезд","56000"},
                {"2","Италия","все включено","5 звезд","45000"},
                {"3","Франция","все включено","3 звезд","60000"},
                {"4","Россия","не включено","2 звезд","10000"},
                {"5","Япония","все включено","7 звезд","90000"},
        };
        System.out.println("В какую страну вы хотите поехать?");
        Vhod vhod = new Vhod();
        PrintSting printSting = new PrintSting();
       printSting.ptint(tout,vhod.s);
    }


}
class PrintSting {
    public void ptint(String[][] massiv,String s){
       for(int i =0; i<massiv.length;i++){
           if(s.equals(massiv[i][1])){
               System.out.printf("%s-%s, комплект- %s,количество звезд- %s,цена - %s",massiv[i][0],massiv[i][1],massiv[i][2],massiv[i][3],massiv[i][4]);
               System.out.println();
           }
       }
    }
}
class Vhod{
    public int cout;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s;


    {
        try {
            System.out.println("В какую страну вы хотите поехать");
            s = reader.readLine();
            System.out.println(" За какую цену вы хотите поехать");
           cout= Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Couter extends  Vhod{
    //int c = cout;
    public void couter(String[][]mas){
        for(int i=0;i<mas.length;i++){
            int k = Integer.parseInt(mas[i][4]);
            if(k>50000){
                System.out.println("это очень дорого");
            }
        }
    }
}