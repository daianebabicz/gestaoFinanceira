package gestaoFinanceira;

public class CompraForaEstado extends CompraAbstrata {

    public CompraForaEstado(String localidade, Produto produto, int quantidade) {
        super(localidade, produto, quantidade);
    }

    @Override
    public void escrituracao() {
        iss = ((quantidade * preco) * 5) / 100;
        icms = (((quantidade * preco) + iss) * 7) / 100;
        frete = ((quantidade * preco) * 5) / 100;
        aPagar = (quantidade * preco) + iss + icms - frete;
        estoque = quantidade * preco;
    }

    @Override
    public double getContaBancaria() {
        return quantidade * preco;
    }

    @Override
    public double getEstoque() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Contas a pagar: " + aPagar + "\nValor em estoque: " + estoque;
    }
}