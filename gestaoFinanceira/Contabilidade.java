package gestaoFinanceira;

public class Contabilidade {
    private double caixa;
    private double contaBancaria;
    private double contasReceber;
    private double estoque;
    private double contasPagar;
    private double capitalSocial;
    private double resultados;

    public Contabilidade() {
        caixa = 10000;
        contaBancaria = 0;
        contasReceber = 0;
        estoque = 0;
        contasPagar = 10000; // manual
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

    public void atualizarContasVenda(double valorVenda) {
        contasReceber += valorVenda;
    }

    public void calcularDRE() {
        resultados = contasReceber - contasPagar;
    }

    public void exibirDRE() {
        calcularDRE();
        System.out.println("----------- Demonstrativo de Resultado de Exercício (DRE) -----------");
        System.out.println("Receitas: " + contasReceber);
        System.out.println("Despesas: " + contasPagar);
        System.out.println("Resultado: " + resultados);
    }

    public void calcularBalancoPatrimonial() {
        capitalSocial = caixa + contaBancaria + contasReceber + estoque - contasPagar;
    }

    public void exibirBalancoPatrimonial() {
        calcularBalancoPatrimonial();
        System.out.println("----------- Balanço Patrimonial -----------");
        System.out.println("Ativo:");
        System.out.println("Caixa: " + caixa);
        System.out.println("Conta bancária: " + contaBancaria);
        System.out.println("Contas a receber: " + contasReceber);
        System.out.println("Estoque: " + estoque);
        System.out.println("Total do Ativo: " + (caixa + contaBancaria + contasReceber + estoque));
        System.out.println("----------- Passivo -----------");
        System.out.println("Contas a pagar: " + contasPagar);
        System.out.println("Capital Social: " + capitalSocial);
    }
}
