/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private HashMap<String, UnidadeCurricular> banco;

    public App() {
        this.banco = new HashMap<>();
    }

    public boolean adicionarUc() {

        String nome, codigo, sigla, ementa;
        int creditos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da disciplina:");
        nome = teclado.nextLine();
        System.out.println("Digite o código:");
        codigo = teclado.nextLine();
        System.out.println("Digite a sigla:");
        sigla = teclado.nextLine();
        System.out.println("Digite o número de créditos:");
        creditos = teclado.nextInt();
        System.out.println("Digite a ementa:");
        ementa = teclado.nextLine();
        UnidadeCurricular nova = new UnidadeCurricular(nome, codigo, sigla, creditos, ementa);
        var teste = this.banco.put(codigo, nova);
        if (teste == null) {
            System.out.println("Disciplina adicionada");
            return true;
        } else {
            this.banco.put(codigo, teste);
            System.out.println("Código de disciplina já existente. Não foi possivel adicionar nova disciplina");
            return false;
        }

    }

    public boolean removerUc() {
        Scanner teclado = new Scanner(System.in);
        String codigo;
        System.out.println("Digite o código da disciplina que deseja remover:");
        codigo = teclado.nextLine();
        var teste = this.banco.remove(codigo);
        if (teste == null) {
            System.out.println("Código da disciplina inexistente");
            return false;
        } else {
            System.out.println("Disciplina removida");
            return true;
        }
    }

    public void menuDeOperacoes() {
        int opcao = 1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Adicionar disciplina;");
            System.out.println("2- Remover disciplina;");
            System.out.println("3- Alterar um dado da disciplina;");
            System.out.println("4- Exibir todos os dados da disciplina;");
            System.out.println("5- Listar sigla, nome e créditos de todas disciplinas;");
            System.out.println("6- Fechar APP.");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    this.adicionarUc();
                    break;
                case 2:
                    this.removerUc();
                    break;
                case 3:
                    this.alterarUc();
                case 4:
                    this.exibirDados();
                case 5:
                    this.listarSiglaNomeCreditos();
                case 6:
                    break;
                default:
                    System.out.println("Digite o número de uma das opções!");
                    break;
            }
        } while (opcao != 6);
    }

    public static void main(String[] args) {


    }

}


