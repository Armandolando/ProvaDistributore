package Distributore;

public class Bevanda extends Prodotto {

    public Bevanda(String nome, String codice, double prezzo) {
        super(nome, codice, prezzo);
    }

    @Override
    public String toString() {
        return (getCodice()+" "+getNome()+" "+getPrezzo());
    }
}
