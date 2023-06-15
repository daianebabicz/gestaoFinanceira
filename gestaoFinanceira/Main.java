package gestaoFinanceira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final FactoryMethod factory = new FactoryMethod();

        var input = new Scanner(System.in);
        System.out.println("Esse é um programa de compra de carros nacionais e internacionais.");
        System.out.println("Comece inserindo a sua localidade: ");
        String localidade = input.next();

        // Criação do estoque de produtos
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(new Produto("Carro", 20000.0));
        estoqueProdutos.adicionarProduto(new Produto("Moto", 10000.0));
        estoqueProdutos.adicionarProduto(new Produto("Bicicleta", 500.0));

        System.out.println("Escolha o item que deseja vender: ");
        estoqueProdutos.mostrarProdutos();
        int opcao = input.nextInt();
        Produto produtoEscolhido = estoqueProdutos.getProduto(opcao);

        System.out.println("Quantos desse item você deseja vender? ");
        int quantidade = input.nextInt();
        input.close();

        Produto novoProduto = new Produto(produtoEscolhido.getNome(), quantidade * produtoEscolhido.getValor());

        CompraAbstrata novaCompra = factory.getCompraAbstrata(localidade, novoProduto);

        // Cálculos e resultados
        Contabilidade contabilidade = new Contabilidade();
        contabilidade.registrarLancamento(novaCompra);
        contabilidade.calcularDRE();
        contabilidade.calcularBalancoPatrimonial();

        // Exibição dos resultados
        contabilidade.exibirDRE();
        contabilidade.exibirBalancoPatrimonial();
    }
}
