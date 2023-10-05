package engtelecom.poo;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone (String r, String n) {
        return true;
    }

    public boolean addEmail (String r, String e) {
        return true;
    }

    public boolean removeTelefone (String r) {
        return true;
    }

    public boolean removeEmail (String r) {
        return true;
    }

    public boolean updateTelefone (String r, String n) {
        return true;
    }

    public boolean updateEmail (String r ,String e) {
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
