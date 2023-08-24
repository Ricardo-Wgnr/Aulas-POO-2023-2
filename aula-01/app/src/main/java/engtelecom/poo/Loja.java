package engtelecom.poo;

import java.util.Scanner;

public class Loja {

    private String nomeProduto;
    private Batedeira batedeira = new Batedeira();

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String obtemInfo(String info) {
        if (nomeProduto.equals("Batedeira")) {
            switch (info) {
                case "Marca":
                    return batedeira.getMarca();
                case "Modelo":
                    return batedeira.getModelo();
                case "Cor":
                    return batedeira.getCor();
                case "Volts":
                    return String.valueOf(batedeira.getVolts());
                case "Potencia":
                    return String.valueOf(batedeira.getPotencia());
                case "Preço":
                    return String.valueOf(batedeira.getPreco());
                default:
                    System.out.println("Info errada");
                    return "";
            }
        } else {
            System.out.println("Nome do produto inválido");
            return "";
        }
    }

    public void setInfo(String info) {
        Scanner teclado = new Scanner(System.in);
        if (nomeProduto.equals("Batedeira")) {
            switch (info) {
                case "Marca":
                    System.out.println("Digite o nome da marca: ");
                    batedeira.setMarca(teclado.nextLine());
                case "Modelo":
                    System.out.println("Digite o nome do modelo: ");
                    batedeira.setModelo(teclado.nextLine());
                case "Cor":
                    System.out.println("Digite o nome da cor: ");
                    batedeira.setCor(teclado.nextLine());
                case "Volts":
                    System.out.println("Digite a voltagem: ");
                    batedeira.setVolts(teclado.nextInt());
                case "Potencia":
                    System.out.println("Digite a potência: ");
                    batedeira.setPotencia(teclado.nextInt());
                case "Preço":
                    System.out.println("Digite o preço: ");
                    batedeira.setPreco(teclado.nextDouble());
                default:
                    System.out.println("Info errada");
            }
        } else {
            System.out.println("Nome do produto inválido");
        }
    }

}
