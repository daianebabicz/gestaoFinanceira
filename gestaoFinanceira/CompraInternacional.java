package gestaoFinanceira;

public class CompraInternacional extends CompraAbstrata {
    public CompraInternacional(String localidade, Produto novoProduto) {
        this.localidade = localidade;
        this.produto = novoProduto.produto;
        this.quantidade = novoProduto.quantidade;
        this.preco = novoProduto.preco;
    }

    @Override
    public void escrituracao() {
        importacao = ((quantidade * preco) * 10) / 100;
        frete = ((quantidade * preco) * 10) / 100;
        aPagar = (quantidade * preco) + importacao - frete;
        estoque = estoque - aPagar;
    }

    @Override
    public double getContaBancaria() {
        return 0; // Valor a ser lançado na conta "Conta bancária"
    }

    @Override
    public double getContasReceber() {
        return 0; // Valor a ser lançado na conta "Contas a receber"
    }

    @Override
    public String toString() {
        return "Contas a pagar: " + aPagar + "\n Valor em estoque: " + estoque;
    }
}
