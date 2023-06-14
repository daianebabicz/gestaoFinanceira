package gestaoFinanceira;

public class CompraEmEstado extends CompraAbstrata {
    public CompraEmEstado(String localidade, Produto novoProduto) {
        this.localidade = localidade;
        this.produto = novoProduto.produto;
        this.quantidade = novoProduto.quantidade;
        this.preco = novoProduto.preco;
    }

    @Override
    public void escrituracao() {
        aPagar = quantidade * preco;
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
