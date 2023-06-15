package gestaoFinanceira;

public class CompraInternacional extends CompraAbstrata {

    public CompraInternacional(String localidade, Produto produto, int quantidade) {
        super(localidade, produto, quantidade);
    }

    @Override
    public void escrituracao() {
        importacao = ((quantidade * preco) * 10) / 100;
        frete = ((quantidade * preco) * 10) / 100;
        aPagar = (quantidade * preco) + importacao - frete;
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