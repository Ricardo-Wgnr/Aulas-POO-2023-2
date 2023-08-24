package engtelecom.poo;

public class Pessoa {

    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa() {
        this.nome = "Ninguém";
        this.dataNascimento = "31/12/1969";
        this.cpf = "000.000.000-00";
    }


    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
