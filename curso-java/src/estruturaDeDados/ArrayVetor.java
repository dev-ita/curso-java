package estruturaDeDados;

import sistemaAlunos.classes.Aluno;
import sistemaAlunos.classes.Disciplina;
import sistemaAlunos.excecao.ExcecaoSetarNota;

public class ArrayVetor {
	public static void main(String[] args) throws ExcecaoSetarNota {
		try {
			Aluno aluno = new Aluno();
			aluno.setNome("italo");
			aluno.setNomeEscola("UEPA");

			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina("java");
			disciplina1.setNota(new double[] { 10, 10, 10, 10 });

			Disciplina disciplina2 = new Disciplina();
			disciplina2.setDisciplina("C++");
			disciplina2.setNota(new double[] { 7, 7, 7, 7 });
			
			aluno.getDisciplinas().add(disciplina1);
			aluno.getDisciplinas().add(disciplina2);

			System.out.println(aluno);
			System.out.println(aluno.verificarAprovacaoStr() + " com a média " + aluno.getMedia());
		} catch (ExcecaoSetarNota e) {
			System.out.println(e.getMessage());
		}
	}
}