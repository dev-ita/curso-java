package estruturaDeDados;

import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Disciplina;
import sistemaAlunos.excecao.ExcecaoSetarNota;

public class ArrayVetor {
	public static void main(String[] args) throws ExcecaoSetarNota {
		try {
			Aluno aluno = new Aluno();
			aluno.setNome("italo");
			aluno.setNomeEscola("Eng. Software");

			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina("java");
			disciplina1.setNota(new double[] { 10, 7, 8, 5 });

			Disciplina disciplina2 = new Disciplina();
			disciplina2.setDisciplina("C++");
			disciplina2.setNota(new double[] { 7, 8, 5, 3 });

			aluno.getDisciplinas().add(disciplina1);
			aluno.getDisciplinas().add(disciplina2);

			System.out.println(aluno);
			System.out.println("aluno " + aluno.verificarAprovacaoStr() + " com a média " + aluno.getMedia());

			System.out.println("-------------------------------------------");
			Aluno[] arrayAlunos = new Aluno[1];
			arrayAlunos[0] = aluno;

			for (int i = 0; i < arrayAlunos.length; i++) {
				System.out.println("O nome do aluno é = " + arrayAlunos[i].getNome());

				for (var d : arrayAlunos[i].getDisciplinas()) {
					System.out.println("Nome da disciplina é: " + d.getDisciplina());
					for (int j = 0; j < d.getNota().length; j++) {
						System.out.println("notas: " + d.getNota()[j]);
					}
				}

				System.out.println("A média do aluno é = " + arrayAlunos[i].getMedia());
			}

		} catch (ExcecaoSetarNota e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}