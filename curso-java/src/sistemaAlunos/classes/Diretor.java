package sistemaAlunos.classes;

import sistemaAlunos.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String password;

	public Diretor() {

	}
	
	public Diretor(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Diretor(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf,
			String nomeMae, String nomePai, String registroEducacao, int tempoDirecao, String titulacao) {
		super(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai);
		this.registroEducacao = registroEducacao;
		this.tempoDirecao = tempoDirecao;
		this.titulacao = titulacao;
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}

	@Override
	public boolean autenticar(String login, String password) {
		this.login = login;
		this.password = password;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("italo1071") && password.equals("isabele123");
	}
}