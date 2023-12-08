package sistemaAlunos.excecao;

public class ExcecaoSetarNota extends Exception {
	private static final long serialVersionUID = 1L;

	public ExcecaoSetarNota(String erro) {
		super("Erro ao setar notas: " + erro);
	}
}