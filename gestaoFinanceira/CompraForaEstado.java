package gestaoFinanceira;

public class CompraForaEstado extends CompraAbstrata {
    public CompraForaEstado(String localidade, Produto novoProduto) {
        this.localidade = localidade;
        this.produto = novoProduto.produto;
        this.quantidade = novoProduto.quantidade;
        this.preco = novoProduto.preco;
    }

    @Override
    public void escrituracao() {
        iss = ((quantidade * preco) * 5) / 100;
        icms = (((quantidade * preco) + iss) * 7) / 100;
        frete = ((quantidade * preco) * 5) / 100;
        aPagar = (quantidade * preco) + iss + icms - frete;
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
