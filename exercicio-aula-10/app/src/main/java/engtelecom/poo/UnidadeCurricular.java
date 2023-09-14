package engtelecom.poo;

import java.util.ArrayList;

public class UnidadeCurricular {

    private String nome;
    private String codigo;
    private String sigla;
    private Integer creditos;
    private Integer semanas;
    private String ementa;
    private ArrayList<String> atributos;
    private ArrayList<String> conteudo;

    public UnidadeCurricular(String nome, String codigo, String sigla, Integer creditos, Integer semanas, String ementa) {
        this.nome = nome;
        this.codigo = codigo;
        this.sigla = sigla;
        this.creditos = creditos;
        this.semanas = semanas;
        this.ementa = ementa;
    }

    public Integer getCargaHoraria() {
        return this.semanas*this.creditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getSemanas() {
        return semanas;
    }

    public void setSemanas(Integer semanas) {
        this.semanas = semanas;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    @Override
    public String toString() {
        return nome + ", " + codigo + ", " + sigla + ", " + creditos + ", "
                + semanas + ", " + ementa + ", " + "[ " + atributos + " ] " + "[ " + conteudo + "]";
    }
}
