package aula_3;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senha) {
		super(cliente, numeroConta, agencia, senha);

	}
	
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Saldo conta corrente:  R$ " + this.saldo);
		System.out.println("Saldo investimento: R$ " + this.saldoInvestimento);
		System.out.println("Saldo total: R$ " + saldoTotal + "\n");
	}

}

