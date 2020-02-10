public class Massiv {
    public static void main(String[] args) {
        int mas[][] = new int[6][6];
        int mas2[][] = {{5,6,7,4},{3,8,7,7}};
        PrintMass.print2(mas);

    }
}
 class PrintMass {
    public static void print(int[][]array ){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void print2(int [][]array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){/////////////////////////Важно
                if(i>j){
                System.out.print(array[i][j]+" ");}
            }
            System.out.println();
        }
    }
 }
