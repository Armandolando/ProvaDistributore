package Distributore;

public interface InterfacciaDistributore {

    public void aggiungiProdotto(String cod, Prodotto p);
    public void prelevaProdotto(String cod, int n50, int n20, int n10, int n5);
    public void stato();
    public void quantitaDenaro();
    public void svuota();
}
