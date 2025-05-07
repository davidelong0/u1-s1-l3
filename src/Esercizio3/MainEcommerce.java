package Esercizio3;

public class MainEcommerce {
    public static void main(String[] args) {
        // 1. Creo alcuni articoli
        Articolo art1 = new Articolo("A001", "Mouse Wireless", 25.90, 10);
        Articolo art2 = new Articolo("A002", "Tastiera Meccanica", 89.99, 5);
        Articolo art3 = new Articolo("A003", "Monitor 24 pollici", 159.99, 3);

        // 2. Creo un cliente
        Cliente cliente = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", "2024-01-15");

        // 3. Creo un carrello per il cliente
        Carrello carrello = new Carrello(cliente);

        // 4. Aggiungo articoli al carrello
        carrello.aggiungiArticolo(art1);
        carrello.aggiungiArticolo(art2);

        // 5. Stampo il carrello
        carrello.stampaCarrello();
    }
}
