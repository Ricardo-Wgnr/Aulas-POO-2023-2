package engtelecom.poo;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class UnidadeCurricular {

    private String nome;
    private String codigo;
    private String sigla;
    private Integer creditos;
    private String ementa;
    private ArrayList<String> objetivos;
    private ArrayList<String> conteudo;

    public UnidadeCurricular(String nome, String codigo, String sigla, Integer creditos, String ementa) {
        this.nome = nome;
        this.codigo = codigo;
        this.sigla = sigla;
        this.creditos = creditos;
        this.ementa = ementa;
        this.objetivos = new ArrayList<>();
        this.conteudo = new ArrayList<>();
    }

    public Integer getCargaHoraria() {
        return Curso.SEMANAS*this.creditos;
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

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " + "Código: " + codigo + ", " + "Sigla: " + sigla + ", " + "Créditos: " + creditos + ", "
                + "Carga Horária: " + getCargaHoraria() + ", " + "Semanas: " + Curso.SEMANAS + ", " + "Ementa: " + ementa + ", "
                + "Objetivos: " + objetivos + ", " + "Conteúdo: " + conteudo;
    }
}
