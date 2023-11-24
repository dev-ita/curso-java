package poo.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	// atributos
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	// construtores
	public Aluno() {
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae, String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
		this.nome = nome;
		this.idade =idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral  = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
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
			if(a.nome.equals(nome)) {
				aluno = a;
			}
		}
		return aluno;
	}

	public double getMedia() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public boolean verificarAprovacao() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String verificarAprovacaoStr() {
		double media = this.getMedia();
		if (media >= 70) {
			return "Aprovado";
		} else if (media >= 50 && media < 70) {
			return "Recuperação";
		} else {
			return "Reprovado";
		}
	}

	// setters, getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

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
