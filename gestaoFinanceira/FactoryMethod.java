package gestaoFinanceira;

public class FactoryMethod {
    public CompraAbstrata getCompraAbstrata(String localidade, Produto novoProduto) {
        if (localidade.equals("Rio de Janeiro")) {
            return new CompraEmEstado(localidade, novoProduto);
        } else if (localidade.equals("São Paulo")) {
            return new CompraForaEstado(localidade, novoProduto);
        } else if (localidade.equals("Milan")) {
            return new CompraInternacional(localidade, novoProduto);
        } else {
            return null;
        }
    }
}
