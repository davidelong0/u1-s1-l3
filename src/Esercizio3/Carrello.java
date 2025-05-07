package Esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Articolo articolo : articoli) {
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public void stampaCarrello() {
        System.out.println("Esercizio3.Carrello di: " + cliente.getNomeCompleto());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Data iscrizione: " + cliente.getDataIscrizione());
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : articoli) {
            System.out.println("- " + articolo.getDescrizione() + " (€" + articolo.getPrezzo() + ")");
        }
        System.out.println("Totale: €" + calcolaTotale());
    }
}
