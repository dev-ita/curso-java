package sistemaAlunos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Disciplina;

public class App {
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno " + qtd + "?");
//			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do aluno?"));
//			String dataNascimento = JOptionPane.showInputDialog(null, "Qual a data de nascimento?");
//			String rg = JOptionPane.showInputDialog(null, "Qual o seu RG?");
//			String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
//			String nomeMae = JOptionPane.showInputDialog(null, "Qual o nome da mãe?");
//			String nomePai = JOptionPane.showInputDialog(null, "Qual o nome do pai?");
//			String dataMatricula = JOptionPane.showInputDialog(null, "Qual a data da martrícula?");
//			String serieMatriculado = JOptionPane.showInputDialog(null, "Qual a série matrículada?");
//			String nomeEscola = JOptionPane.showInputDialog(null, "Qual o nome da escola?");

			Aluno aluno = new Aluno(nome);
//			Aluno aluno = new Aluno(nome, idade, dataNascimento, rg, cpf, nomeMae, nomePai, dataMatricula, serieMatriculado, nomeEscola);

			int numeroDisciplinas = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você tem?"));

			for (int i = 1; i <= numeroDisciplinas; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog(null, "Qual o nome da disciplina " + i);
				double notaDisciplina = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota da disciplina" + i));
				aluno.getDisciplinas().add(new Disciplina(nomeDisciplina, notaDisciplina));
			}

			int removerDisciplina = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (removerDisciplina == 0) {
				int continuarRemover = 0;
				do {
					if (aluno.getDisciplinas().size() > 1) {
						String nomeDisciplina = JOptionPane.showInputDialog(null,
								"Qual o nome da disciplina a ser removida?");
						Disciplina disciplinaRemovida = aluno.removeDisciplina(nomeDisciplina);
						System.out.println("Disciplina removida = " + disciplinaRemovida);
						continuarRemover = JOptionPane.showConfirmDialog(null,
								"Deseja continuar removendo disciplinas?");
					} else {
						JOptionPane.showMessageDialog(null, "Você deve ter pelo menos uma disciplina cadastrada");
						continuarRemover = -1;
					}
				} while (continuarRemover == 0);
			}
			alunos.add(aluno);
		}

		int removerAluno = JOptionPane.showConfirmDialog(null, "deseja remover algum aluno?");

		if (removerAluno == 0) {
			String removeNomeAluno = JOptionPane.showInputDialog(null, "Qual o nome do aluno a ser removido?");

			Aluno buscarAluno = Aluno.searchAluno(removeNomeAluno, alunos);
			if (buscarAluno != null) {
				alunos.remove(buscarAluno);
			} else {
				System.out.println("Aluno não encontrado!");
			}
		}

		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);

			// substituindo um aluno
			if (aluno.getNome().equalsIgnoreCase("italo")) {
				Aluno trocar = new Aluno();
				trocar.setNome("aluno trocado");

				Disciplina disciplina1 = new Disciplina("java", 100);
				Disciplina disciplina2 = new Disciplina("C++", 100);
				trocar.getDisciplinas().add(disciplina1);
				trocar.getDisciplinas().add(disciplina2);
				
				alunos.set(i, trocar);
				aluno = alunos.get(i);
			}
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média = " + aluno.getMedia());
			System.out.println("Resultado = " + aluno.verificarAprovacaoStr());

			System.out.println("==========================disciplinas===========================");
			for (int j = 0; j < aluno.getDisciplinas().size(); j++) {
				Disciplina disciplina = aluno.getDisciplinas().get(j);
				System.out.println("materia = " + disciplina.getDisciplina() + ", nota = " + disciplina.getNota());
			}
			System.out.println("================================================================");
		}

		System.out.println(alunos.size() + " " + alunos);
	}
}