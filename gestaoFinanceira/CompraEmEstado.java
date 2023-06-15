package gestaoFinanceira;

public class CompraEmEstado extends CompraAbstrata {

    public CompraEmEstado(String localidade, Produto produto, int quantidade) {
        super(localidade, produto, quantidade);
    }

    @Override
    public double getCaixa() {
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