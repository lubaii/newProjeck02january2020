public class StakHeap {
private int number = 2;
    public static void main(String[] args) {
        StakHeap stakHeap = new StakHeap();
        System.out.println(stakHeap.number);
        // строка 1
        int i=1; // строка 2
        Object object = new Object(); // строка 3
        StakHeap memory = new StakHeap(); // строка 4
        memory.exMethod(object); // строка 5
    } // строка 9

    private void exMethod(Object param) { // строка 6
        String string = param.toString(); // строка 7
        System.out.println(string );
    } // строка 8

    ;

}
