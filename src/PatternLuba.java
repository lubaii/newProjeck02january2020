import java.lang.reflect.Array;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternLuba {
    public static void main(String[] args) {
        String s = "asdf 12 adf214 df";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        int cout=0;
        while (matcher.find()) {
            cout++;
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
        System.out.println("Число цифр " +cout);
        System.out.println("Число симоволов в строке s "+s.length());
        String[] mas = s.split(" ");
        int cout2=0;
        for (int i =0 ; i<mas.length;i++){
            cout2++;
        System.out.println(mas[i]);
        }
        System.out.println("Число слов " + cout2);
        Random random = new Random();
        int mass [] = new int[10];
        for(int i = 0; i<mass.length;i++){
            mass[i]=random.nextInt(10);
            System.out.println("["+i+"]= "+mass[i]);
        }

        int mas2[] =new int[10];
        System.arraycopy(mass,0,mas2,0,10);
        System.out.println("Выведен второй отсортированный масссив");
        for (int i =0;i<mas2.length;i++){
           for (int j=i+1;j<mas2.length;j++){
               int sum = 0;
               if(mas2[j]<mas2[i]){
                   sum=mas2[j];
                   mas2[i]=mas2[j];
                   mas2[j]=sum;
               }

           }System.out.println("["+i+"]="+mas2[i]);
        }
        System.out.println("Люба молодец!");
    }
}
