package sistemaAlunos.classes;

public class Secretario extends Pessoa {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	public Secretario() {

	}

	public Secretario(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf,
			String nomeMae, String nomePai, String registro, String nivelCargo, String experiencia) {
		super(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai);
		this.registro = registro;
		this.nivelCargo = nivelCargo;
		this.experiencia = experiencia;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}

}