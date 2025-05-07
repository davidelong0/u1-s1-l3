package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> chiamateRecenti;

    // Costruttore: solo numero di telefono, credito = 0, lista vuota
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0;
        this.chiamateRecenti = new ArrayList<>();
    }

    // Metodo per aggiungere una chiamata alla lista (max 5)
    public void aggiungiChiamata(Chiamata chiamata) {
        if (chiamateRecenti.size() == 5) {
            // rimuove la chiamata più vecchia (prima della lista)
            chiamateRecenti.remove(0);
        }
        chiamateRecenti.add(chiamata);
    }

    // Metodo per stampare i dati della Esercizio2.SIM
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: €" + creditoDisponibile);
        System.out.println("Ultime chiamate:");
        if (chiamateRecenti.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : chiamateRecenti) {
                System.out.println("- Numero: " + c.getNumeroChiamato() +
                        ", Durata: " + c.getDurataMinuti() + " minuti");
            }
        }
    }

    // Setter per aggiungere credito
    public void aggiungiCredito(double importo) {
        creditoDisponibile += importo;
    }
}
