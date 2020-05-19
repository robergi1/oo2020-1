public class Test {

    public static void main(String[] args) {
        Printresult();
    }


    public static void printNumbersAsc(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printNumbersDesc(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printCharacters(){

        for (int i = 97; i <= 107; i++) {
            char c=(char)i;
            ;
            System.out.println(String.valueOf(c));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printCharactersDesc(){

        for (int i = 107; i >= 97; i--) {
            char c=(char)i;
            ;
            System.out.println(String.valueOf(c));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Printresult(){
        new Thread(Test::printCharacters).start();
        new Thread(Test::printCharactersDesc).start();
        new Thread(Test::printNumbersDesc).start();
        new Thread(Test::printNumbersAsc).start();
    }



}