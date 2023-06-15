package gestaoFinanceira;

public class FactoryMethod {
    public CompraAbstrata getCompraAbstrata(String localidade, Produto novoProduto) {
        if (localidade.equals("RJ")) {
            return new CompraEmEstado(localidade, novoProduto, 10);
        } else if (localidade.equals("SP")) {
            return new CompraForaEstado(localidade, novoProduto, 10);
        } else if (localidade.equals("BH")) {
            return new CompraInternacional(localidade, novoProduto, 10);
        } else {
            return null;
        }
    }
}
