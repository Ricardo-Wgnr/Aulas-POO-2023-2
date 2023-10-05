package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa (Pessoa p) {
        return contatos.add(p);
    }

    public boolean removePessoa (String n, String s) {
        for (int index = 0; index < contatos.size(); index++) {
            if (contatos.get(index).getNome().equals(n) && contatos.get(index).getSobrenome().equals(s)) {
                contatos.remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean addTelefone (String r, String n, int pIndex) {
        return contatos.get(pIndex).addTelefone(r, n);
    }

    public boolean addEmail (String r, String e, int pIndex) {
        return contatos.get(pIndex).addEmail(r, e);
    }

    public boolean updateTelefone (String r, String n, int pIndex) {
        return contatos.get(pIndex).updateTelefone(r, n);
    }

    public boolean updateEmail (String r, String e, int pIndex) {
        return contatos.get(pIndex).updateEmail(r, e);
    }

    public boolean removeTelefone (String r, int pIndex) {
        return contatos.get(pIndex).removeTelefone(r);
    }

    public boolean removeEmail (String r, int pIndex) {
        return contatos.get(pIndex).removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
