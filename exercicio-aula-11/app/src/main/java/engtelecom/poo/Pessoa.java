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
        return telefones.add(r, n);
    }

    public boolean addEmail (String r, String e) {
        return emails.add(r, e);

    }

    public boolean removeTelefone (String r) {
        return (telefones.remove(r));
    }

    public boolean removeEmail (String r) {
        return emails.remove(r);
    }

    public boolean updateTelefone (String r, String n) {
        return telefones.update(r, n);
    }

    public boolean updateEmail (String r ,String e) {
        return emails.update(r, e);
    }

    @Override
    public String toString() {
        return  "Nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", data nascimento=" + dataNascimento +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
