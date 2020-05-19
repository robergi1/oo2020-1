public class Main {
    public static void main(String[] args) {



        Barrel vaat1 = new Barrel(300,60);
        System.out.println(vaat1);
        vaat1.Fill(90);
        System.out.println(vaat1);

        Bottle jook1 = new Bottle(Dtype.Õlu,Btype.PURK,29,300);


        Bottle jook2 = new Bottle(Dtype.VESI,Btype.PLASTIK,29,300);


        Bottle jook3 = new Bottle(Dtype.PIIM,Btype.KLAAS,29,300);


        vaat1.FillBottles(jook1,jook2,jook3);

        Package kast1 = new Package();
        kast1.AddBottle(jook1);
        kast1.PrintInfo();
        kast1.AddBottle(jook2);
        kast1.PrintInfo();
        kast1.AddBottle(jook3);
        kast1.PrintInfo();


    }
}