package entidades;

public class ContaPoupanca extends Conta {

	private Double jurostaxa;
	
	public ContaPoupanca() {
	  super();	
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double jurostaxa) {
		super(numero, titular, saldo);
		this.jurostaxa = jurostaxa;
	}

	public Double getJurostaxa() {
		return jurostaxa;
	}

	public void setJurostaxa(Double jurostaxa) {
		this.jurostaxa = jurostaxa;
	}
	
	public void atualizarSaldo() {
	  saldo += saldo*jurostaxa;
	}
	
	@Override
	public void retirar(double quantidade) {
	  saldo -= quantidade;	
	}
	
	
}
