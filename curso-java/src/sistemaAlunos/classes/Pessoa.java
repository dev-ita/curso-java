package sistemaAlunos.classes;

// o abstract serve para que essa classe seja apenas um modelo para as outras, ela não pode ser instânciada e virar um objeto.
public abstract class Pessoa {

	// protected siginifca que vai ser visivel a super classe e as sub classes
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	// criando um método abstrato, isso faz com que todas as subclasses sejam obrigadas a implementar este método.
	public abstract double salario();

	public Pessoa() {

	}
	
	public Pessoa(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae, String nomePai) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
	}

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
	
	public boolean pessoaMaiorDeIdade() {
		return (this.idade >= 18) ? true : false;	}

}