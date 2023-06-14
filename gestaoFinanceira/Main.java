package gestaoFinanceira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final FactoryMethod factory = new FactoryMethod();
        final Contabilidade contabilidade = new Contabilidade();

        var input = new Scanner(System.in);
        System.out.println("Esse é um programa de compra de carros nacionais e internacionais.");
        System.out.println("Comece inserindo a sua localidade: ");
        String localidade = input.next();

        System.out.println("Qual o produto?");
        String produto = input.next();

        System.out.println("Por quanto você gostaria de vender o produto? ");
        double preco = input.nextDouble();

        System.out.println("Finalmente, qual a quantidade do produto?");
        int quantidade = input.nextInt();
        input.close();

        Produto novoProduto = new Produto(produto, quantidade, preco);

        CompraAbstrata novaCompra = factory.getCompraAbstrata(localidade, novoProduto);
        novaCompra.escrituracao();

        contabilidade.registrarLancamento(novaCompra);
        contabilidade.calcularDRE();
        contabilidade.calcularBalancoPatrimonial();
        contabilidade.exibirDRE();
        contabilidade.exibirBalancoPatrimonial();
    }
}
