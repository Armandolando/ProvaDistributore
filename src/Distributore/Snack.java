package Distributore;

public class Snack extends Prodotto {

    private int quantita;

    public Snack(String nome, String codice, double prezzo) {
        super(nome, codice, prezzo);
        this.quantita=20;
    }

    public boolean prelevaSnack(){
        if(quantita>0){
            quantita -=1;
            return true;
        }

        return false;
    }

    public int getQuantita() {
        return quantita;
    }

    @Override
    public String toString() {
        return (getCodice()+" "+getNome()+" "+getPrezzo());
    }
}
