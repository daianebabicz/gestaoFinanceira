package gestaoFinanceira;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos {
    private List<Produto> produtos;

    public EstoqueProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println(i + 1 + ". " + produto.getNome() + " - R$" + produto.getValor());
        }
    }

    public Produto getProduto(int indice) {
        if (indice >= 1 && indice <= produtos.size()) {
            return produtos.get(indice - 1);
        }
        return null;
    }
}
