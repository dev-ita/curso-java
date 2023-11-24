package poo;

import javax.swing.JOptionPane;
import poo.classes.Aluno;
import poo.classes.Disciplina;

public class App {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno?");
//		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do aluno?"));
//		String dataNascimento = JOptionPane.showInputDialog(null, "Qual a data de nascimento?");
//		String rg = JOptionPane.showInputDialog(null, "Qual o seu RG?");
//		String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
//		String nomeMae = JOptionPane.showInputDialog(null, "Qual o nome da mãe?");
//		String nomePai = JOptionPane.showInputDialog(null, "Qual o nome do pai?");
//		String dataMatricula = JOptionPane.showInputDialog(null, "Qual a data da martrícula?");
//		String serieMatriculado = JOptionPane.showInputDialog(null, "Qual a série matrículada?");
//		String nomeEscola = JOptionPane.showInputDialog(null, "Qual o nome da escola?");
		int numeroDisciplinas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você tem?"));

		Aluno aluno1 = new Aluno();

		for (int i = 1; i <= numeroDisciplinas; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog(null, "Qual o nome da disciplina " + i);
			double notaDisciplina = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota da disciplina" + i));
			aluno1.getDisciplinas().add(new Disciplina(nomeDisciplina, notaDisciplina));
		}

		int removerDisciplina = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if (removerDisciplina == 0) {
			int continuarRemover = 0;
			do {
				if (aluno1.getDisciplinas().size() > 1) {
					String nomeDisciplina = JOptionPane.showInputDialog(null,
							"Qual o nome da disciplina a ser removida?");
					aluno1.removeDisciplina(nomeDisciplina);
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo disciplinas?");
				} else {
					JOptionPane.showMessageDialog(null, "Você deve ter pelo menos uma disciplina cadastrada");
					continuarRemover = -1;
				}

			} while (continuarRemover == 0);
		}

		aluno1.setNome(nome);
//		aluno1.setIdade(idade);
//		aluno1.setDataMatricula(dataMatricula);
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setNomeEscola(nomeEscola);
//		aluno1.setNomeMae(nomeMae);
//		aluno1.setNomePai(nomePai);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setSerieMatriculado(serieMatriculado);
//		aluno1.setRegistroGeral(rg);

		System.out.println(aluno1.toString());
		System.out.println("Média = " + aluno1.getMedia());
		System.out.println("Resultado = " + aluno1.verificarAprovacaoStr());
	}
}