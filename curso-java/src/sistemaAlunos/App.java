package sistemaAlunos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Diretor;
import sistemaAlunos.classes.Disciplina;
import sistemaAlunos.classesAuxiliares.FuncaoAutenticacao;
import sistemaAlunos.constantes.StatusAluno;
import sistemaAlunos.excecao.ExcecaoProcessarNota;
import sistemaAlunos.interfaces.PermitirAcesso;

public class App {
	public static void main(String[] args) {

		try {

			lerArquivo();

			String login = JOptionPane.showInputDialog(null, "Informa o login");
			String password = JOptionPane.showInputDialog(null, "Informa a senha");

			// autenticação do secretário
			// utilizando interface com construtor

			PermitirAcesso acessoDiretor = new Diretor(login, password);
			FuncaoAutenticacao autenticarDiretor = new FuncaoAutenticacao(acessoDiretor);

			// Vou travar o contrato para autorizar somente quem realmente tem o contrato
			// 100% legítimo
			if (autenticarDiretor.autenticarLogin()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				// é uma lista que armazena seus valores acessando uma chave que identifica uma
				// sequência de valores
				// ex: Hash{aprovados[alunos...], reprovados[alunos...]}
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				// adicionar alunos
				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno " + qtd + "?");
					int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do aluno?"));
//			String dataNascimento = JOptionPane.showInputDialog(null, "Qual a data de nascimento?");
//			String rg = JOptionPane.showInputDialog(null, "Qual o seu RG?");
//			String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
//			String nomeMae = JOptionPane.showInputDialog(null, "Qual o nome da mãe?");
//			String nomePai = JOptionPane.showInputDialog(null, "Qual o nome do pai?");
//			String dataMatricula = JOptionPane.showInputDialog(null, "Qual a data da martrícula?");
//			String serieMatriculado = JOptionPane.showInputDialog(null, "Qual a série matrículada?");
//			String nomeEscola = JOptionPane.showInputDialog(null, "Qual o nome da escola?");

					Aluno aluno = new Aluno(nome);
					aluno.setIdade(idade);
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
								JOptionPane.showMessageDialog(null,
										"Você deve ter pelo menos uma disciplina cadastrada");
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
					System.out.println(aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = "
							+ aluno.getMedia());
				}

				System.out.println("------------------------- lista dos reprovados ------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = "
							+ aluno.getMedia());
				}

				System.out.println("------------------------- lista de recuperação ------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getNome() + ", " + aluno.verificarAprovacaoStr() + " com a média de = "
							+ aluno.getMedia());
				}

//		System.out.println(alunos.size() + " " + alunos);

			} else {
				JOptionPane.showMessageDialog(null, "Credenciais inválidas.", "erro", JOptionPane.ERROR_MESSAGE);
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace();

			System.out.println("Mensagem: " + e.getMessage());

			// imprimindo a pilha de erros, o getStackTrace retorna um array de
			// StrackTraceElement[]
			for (var item : e.getStackTrace()) {
				saida.append("\nClasso de erro: " + item.getClassName());
				saida.append("\nMétodo de erro: " + item.getMethodName());
				saida.append("\nLinha de erro: " + item.getLineNumber());
				saida.append("\nClass: " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro na conversão de numero: " + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um NullPointerException no programa: " + e);
		} catch (ExcecaoProcessarNota e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada: " + e.getClass().getName());
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Erro genérico: " + e.getMessage());
		} finally { // não é obrigatório usar, ele sempre será executado independente de erro
			JOptionPane.showMessageDialog(null, "Aprendendo java");
		}
	}

	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File file = new File("arquivo.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}