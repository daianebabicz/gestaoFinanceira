package gestaoFinanceira;

public abstract class CompraAbstrata {
    public String localidade;
    public String produto;
    public int quantidade;
    public double preco;
    public double icms;
    public double iss;
    public double importacao;
    public double frete;
    public double estoque;
    public double aPagar;

    public void escrituracao() {
        aPagar = quantidade * preco;
        estoque = estoque - aPagar;
    }

    @Override
    public String toString() {
        return "Contas a pagar: " + aPagar + "\n Valor em estoque: " + estoque;
    }

    // Métodos adicionados para retornar os valores dos lançamentos contábeis
    public double getCaixa() {
        return aPagar; // Valor a ser lançado na conta "Caixa"
    }

    public double getContaBancaria() {
        return 0; // Valor a ser lançado na conta "Conta bancária"
    }

    public double getContasReceber() {
        return 0; // Valor a ser lançado na conta "Contas a receber"
    }

    public double getEstoque() {
        return estoque; // Valor a ser lançado na conta "Estoque"
    }

    public double getContasPagar() {
        return aPagar; // Valor a ser lançado na conta "Contas a pagar"
    }
}
