import Distributore.*;

public class Tester {
    public static void main(String[] args) {
        Distributore ds = new DistibutoreSnack(0);
        Distributore db = new DistributoreBevande(0);
        FReader f = new FReader();

        f.load(ds,"snack.txt");
        f.load(db,"bevande.txt");

        ds.stato();
        db.stato();

        ds.prelevaProdotto("PATA1",0,2,0,0);
        db.prelevaProdotto("EXP 10",0,1,1,1);

        ds.stato();
        db.stato();


    }
}
