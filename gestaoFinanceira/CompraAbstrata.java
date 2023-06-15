package gestaoFinanceira;

public abstract class CompraAbstrata {
    protected String localidade;
    protected Produto produto;
    protected int quantidade;
    protected double preco;
    protected double icms;
    protected double iss;
    protected double importacao;
    protected double frete;
    protected double estoque;
    protected double aPagar;

    public CompraAbstrata(String localidade, Produto produto, int quantidade) {
        this.localidade = localidade;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getValor();
        this.icms = 0;
        this.iss = 0;
        this.importacao = 0;
        this.frete = 0;
        this.estoque = 0;
        this.aPagar = 0;
    }

    public void escrituracao() {
        aPagar = quantidade * preco;
        estoque = estoque - aPagar;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getCaixa() {
        return 0; // Implementação para caixa na compra em cada estado
    }

    public double getContaBancaria() {
        return 0; // Implementação para conta bancária na compra em cada estado
    }

    public double getContasReceber() {
        return 0; // Implementação para contas a receber na compra em cada estado
    }

    public double getEstoque() {
        return estoque;
    }

    public double getContasPagar() {
        return aPagar;
    }

    @Override
    public String toString() {
        return "Contas a pagar: " + aPagar + "\nValor em estoque: " + estoque;
    }
}
