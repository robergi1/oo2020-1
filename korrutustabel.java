public class korrutustabel {
     
    public static void main(String[] args) {
        int tableSize = 9;
        tabel(tableSize);
    }
     
    public static void tabel(int tableSize) {
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ;i<=tableSize;i++) {
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
     
}