package Esercizio2;

public class MainTelefono {
    public static void main(String[] args) {
        // Creo una nuova Esercizio2.SIM con numero a scelta
        SIM miaSim = new SIM("3331234567");

        // Aggiungo alcune chiamate
        miaSim.aggiungiChiamata(new Chiamata("3451112233", 3));
        miaSim.aggiungiChiamata(new Chiamata("3475557788", 5));
        miaSim.aggiungiChiamata(new Chiamata("3209988776", 2));
        miaSim.aggiungiChiamata(new Chiamata("3891122334", 1));
        miaSim.aggiungiChiamata(new Chiamata("3916677885", 4));
        // Aggiungiamo una sesta chiamata → la prima sarà eliminata
        miaSim.aggiungiChiamata(new Chiamata("3920001112", 6));

        // Stampo tutti i dati della Esercizio2.SIM
        miaSim.stampaDatiSIM();
    }
}
