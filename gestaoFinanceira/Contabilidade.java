package gestaoFinanceira;

public class Contabilidade {
    private double caixa;
    private double contaBancaria;
    private double contasReceber;
    private double estoque;
    private double bens;
    private double contasPagar;
    private double capitalSocial;
    private double resultados;

    public Contabilidade() {
        caixa = 0;
        contaBancaria = 0;
        contasReceber = 0;
        estoque = 0;
        bens = 0;
        contasPagar = 0;
        capitalSocial = 0;
        resultados = 0;
    }

    public void registrarLancamento(CompraAbstrata compra) {
        caixa += compra.getCaixa();
        contaBancaria += compra.getContaBancaria();
        contasReceber += compra.getContasReceber();
        estoque += compra.getEstoque();
        contasPagar += compra.getContasPagar();
    }

    public void calcularDRE() {
        resultados = contasReceber - contasPagar;
    }

    public void calcularBalancoPatrimonial() {
        bens = caixa + contaBancaria + estoque;
        capitalSocial = bens - contasPagar;
    }

    public void exibirDRE() {
        System.out.println("Demonstrativo de Resultado de Exercício (DRE):");
        System.out.println("Receitas: " + contasReceber);
        System.out.println("Despesas: " + contasPagar);
        System.out.println("Resultado: " + resultados);
    }

    public void exibirBalancoPatrimonial() {
        System.out.println("Balanço Patrimonial:");
        System.out.println("Ativo:");
        System.out.println("Caixa: " + caixa);
        System.out.println("Conta bancária: " + contaBancaria);
        System.out.println("Estoque: " + estoque);
        System.out.println("Total do Ativo: " + bens);
        System.out.println("Passivo:");
        System.out.println("Contas a pagar: " + contasPagar);
        System.out.println("Capital Social: " + capitalSocial);
    }
}
