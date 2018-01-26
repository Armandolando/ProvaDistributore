package Distributore;

import java.util.HashMap;

public class DistibutoreSnack extends Distributore {

    private int nCassetti;
    private int nMax = 6;
    private HashMap<String,Prodotto> prodotti;
    private  double monete;

    public DistibutoreSnack(int nCassetti, double monete) {
        this.nCassetti = nMax;
        this.monete = monete;
    }

    public DistibutoreSnack(int nCassetti) {

        this.nCassetti = nMax;
    }

    @Override
    public void aggiungiProdotto(String cod, Prodotto p) {
        if(p instanceof Snack){
            prodotti.put(cod,p);
        }
        else{
            System.out.println("Solo snack");
        }
    }

    @Override
    public void prelevaProdotto(String cod, int n50, int n20, int n10, int n5) {
        double a = 0.50*n50+0.20*n20+0.10*n10+0.5*n5;
        if(prodotti.get(cod).getPrezzo()==a){

            if(((Snack)prodotti.get(cod)).prelevaSnack()) {
                monete+=a;
                System.out.println("Prodotto in erogazione");
            }
            else{
                System.out.println("Prodotto finito");
            }
        }
        else{
            System.out.println("Importo non corretto");
        }
    }

    public void stato(){
        System.out.println("Prodotti disponibili");
        for(String key : prodotti.keySet()){
            if(((Snack)prodotti.get(key)).getQuantita()!=0){
                System.out.println((Snack)prodotti.get(key));
            }
        }
        System.out.println("Prodotti esauriti");
        for(String key : prodotti.keySet()){
            if(((Snack)prodotti.get(key)).getQuantita()==0){
                System.out.println((Snack)prodotti.get(key));
            }
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
