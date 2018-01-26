package Distributore;

import java.util.HashMap;

public class DistributoreBevande extends Distributore {


    private HashMap<String,Prodotto> prodotti;
    private int quantitaProdotto;
    private  double monete;

    public DistributoreBevande(double monete) {
        this.monete = monete;
        this.quantitaProdotto = 500;
    }



    @Override
    public void aggiungiProdotto(String cod, Prodotto p) {
        if(p instanceof Bevanda){
            prodotti.put(cod,p);
        }
    }


    @Override
    public void prelevaProdotto(String cod, int n50, int n20, int n10, int n5) {

        double a = 0.50*n50+0.20*n20+0.10*n10+0.5*n5;
        if(prodotti.get(cod).getPrezzo()==a){
            quantitaProdotto -= 10;
            monete+=a;
            System.out.println("Prodotto in erogazione");
        }
        else{
            System.out.println("Importo non corretto");
        }
    }

    @Override
    public void stato() {
        if(quantitaProdotto!=0){
        System.out.println("Prodotti disponibili");
        for(String key : prodotti.keySet()){

                System.out.println((Bevanda)prodotti.get(key));
            }
        }
        else {
            System.out.println("Prodotto finito");
        }
    }

    @Override
    public void quantitaDenaro() {
        System.out.println(monete);
    }

    @Override
    public void svuota() {
        monete = 0;
        System.out.println("Distributore svuotato");
    }


}
