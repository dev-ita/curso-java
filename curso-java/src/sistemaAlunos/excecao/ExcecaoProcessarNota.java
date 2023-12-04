package sistemaAlunos.excecao;

public class ExcecaoProcessarNota extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcecaoProcessarNota(String erro) {
		super("erro no processamento das notas do aluno: " + erro);
	}

}