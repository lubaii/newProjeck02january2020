public class BubbleLuba {
    private int mas[];
    private  int cout;

    public BubbleLuba(int dlina,int cout) {
        this.mas= new int[dlina];
        this.cout=cout;
         //cout=0;
    }

    public  void into(int value){
        mas[cout]= value;
        cout++;
    }

  //  public BubbleLuba(int[] mas) {
    //    this.mas = mas;

   // }

    public void print(){
        for(int i = 0; i<mas.length;i++){
            System.out.println(mas[i]);
        }
    }



}
 class Bubl{
     public static void main(String[] args) {
         //BubbleLuba bubbleLuba = new BubbleLuba(new int[5]);
         BubbleLuba bubbleLuba2 = new BubbleLuba(5,0);
         bubbleLuba2.into(6);
         bubbleLuba2.into(7);
         bubbleLuba2.into(9);
         bubbleLuba2.print();
     }
 }