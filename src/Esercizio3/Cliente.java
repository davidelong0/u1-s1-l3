package Esercizio3;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, String dataIscrizione) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public String getCodice() {
        return codice;
    }
}
