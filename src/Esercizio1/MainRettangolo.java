package Esercizio1;

public class MainRettangolo {

    // METODO per stampare un rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    // METODO per stampare due rettangoli e le somme
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Esercizio1.Rettangolo 1:");
        stampaRettangolo(r1);
        System.out.println("Esercizio1.Rettangolo 2:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma Aree: " + sommaAree);
        System.out.println("Somma Perimetri: " + sommaPerimetri);
    }

    // METODO PRINCIPALE: è il punto di partenza
    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(4, 6); // crea un rettangolo 4x6
        Rettangolo rett2 = new Rettangolo(3, 5); // crea un rettangolo 3x5

        // Stampa info del primo rettangolo
        System.out.println("=== Primo Esercizio1.Rettangolo ===");
        stampaRettangolo(rett1);

        // Stampa info dei due rettangoli e la somma
        System.out.println("\n=== Due Rettangoli ===");
        stampaDueRettangoli(rett1, rett2);
    }
}
