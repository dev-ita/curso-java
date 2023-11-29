package sistemaAlunos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Disciplina;
import sistemaAlunos.constantes.StatusAluno;

public class App {
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		// é uma lista que armazena seus valores acessando uma chave que identifica uma sequência de valores
		// ex: Hash{aprovados[alunos...], reprovados[alunos...]}
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		// adicionar alunos
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
		
		// inicializando o map
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

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

		for (Aluno aluno : alunos) {
			if (aluno.verificarAprovacaoStr().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.verificarAprovacaoStr().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}

		System.out.println("------------------------- lista dos aprovados ------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(
					aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = " + aluno.getMedia());
		}

		System.out.println("------------------------- lista dos reprovados ------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(
					aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = " + aluno.getMedia());
		}

		System.out.println("------------------------- lista de recuperação ------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(
					aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = " + aluno.getMedia());
		}

//		System.out.println(alunos.size() + " " + alunos);
	}
}