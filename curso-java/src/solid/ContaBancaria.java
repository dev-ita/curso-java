package solid;

public class ContaBancaria {

	private String descricao;
	private double saldo = 8000;

	public ContaBancaria() {}

	public ContaBancaria(double saldo, String descricao) {
		this.saldo = saldo;
		this.descricao = descricao;
	}

	public void soma100reais() {
		this.saldo += 100;
	}

	public void diminui100reais() {
		this.saldo -= 100;
	}

	public void sacarDinheiro(double saque) {
		this.saldo -= saque;
	}

	public void depositarDinheiro(double deposito) {
		this.saldo += deposito;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

}