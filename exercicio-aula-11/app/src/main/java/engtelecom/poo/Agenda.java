package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa (Pessoa p) {
        return true;
    }

    public boolean removePessoa (String n, String s) {
        return true;
    }

    public boolean addTelefone (String r, String n, int pIndex) {
        return true;
    }

    public boolean addEmail (String r, String e, int pIndex) {
        return true;
    }

    public boolean updateTelefone (String r, String n, int pIndex) {
        return true;
    }

    public boolean updateEmail (String r, String e, int pIndex) {
        return true;
    }

    public boolean removeTelefone (String r, int pIndex) {
        return true;
    }

    public boolean removeEmail (String r, int pIndex) {
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
