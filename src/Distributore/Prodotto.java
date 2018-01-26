package Distributore;

public abstract  class Prodotto {

    private String nome;
    private String codice;
    private double prezzo;

    public Prodotto(String nome, String codice, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
