package sistemaAlunos.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sistemaAlunos.constantes.StatusAluno;

public class Aluno extends Pessoa {
	// atributos
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	// construtores
	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {

		// alimentando a super classe <Pessoa>
		super(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai);

		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
	}

	// métodos

	public Disciplina removeDisciplina(String nome) {
		Disciplina disciplinaRemovida = null;
		for (Disciplina disciplina : this.disciplinas) {
			if (disciplina.getDisciplina().equals(nome)) {
				int index = this.disciplinas.indexOf(disciplina);
				disciplinaRemovida = this.disciplinas.remove(index);
				break;
			}
		}
		return disciplinaRemovida;
	}

	public static Aluno searchAluno(String nome, List<Aluno> alunos) {
		Aluno aluno = null;
		for (Aluno a : alunos) {
			if (a.nome.equals(nome)) {
				aluno = a;
			}
		}
		return aluno;
	}

	public double getMedia() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMedia();
		}
		return somaNotas / disciplinas.size();
	}

	public boolean verificarAprovacao() {
		double media = this.getMedia();
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	public String verificarAprovacaoStr() {
		double media = this.getMedia();
		if (media >= 7) {
			return StatusAluno.APROVADO;
		} else if (media >= 5 && media < 7 ) {
			return StatusAluno.RECUPERACAO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	// setters, getters
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override // identifica método sobreescrito
	public boolean pessoaMaiorDeIdade() {
		return idade >= 21;
	}

	public String msgMaiorDeIdade() {
		return this.pessoaMaiorDeIdade() ? "O aluno ja é maior de idade!" : "O aluno é menor de idade!";
	}
	
	@Override
	public double salario() {
		return 1500.90;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
}
