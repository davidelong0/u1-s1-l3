package Esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private int durataMinuti;

    // Costruttore
    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    // Getter
    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }
}
