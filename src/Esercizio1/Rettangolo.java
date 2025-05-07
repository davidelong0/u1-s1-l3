package Esercizio1;

public class Rettangolo {
    // ATTRIBUTI PRIVATI (incapsulamento)
    private double altezza;
    private double larghezza;

    // COSTRUTTORE: serve per creare un nuovo Esercizio1.Rettangolo
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // GETTER E SETTER per leggere/modificare i valori
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    // METODO per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // METODO per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }
}
