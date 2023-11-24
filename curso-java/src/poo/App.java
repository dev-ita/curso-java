package poo;

import javax.swing.JOptionPane;

import poo.classes.Aluno;
import poo.classes.Disciplina;

public class App {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();

		String nome = JOptionPane.showInputDialog(null, "Qual o nome do aluno?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade do aluno?"));
		String dataNascimento = JOptionPane.showInputDialog(null, "Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog(null, "Qual o seu RG?");
		String cpf = JOptionPane.showInputDialog(null, "Qual seu CPF?");
		String nomeMae = JOptionPane.showInputDialog(null, "Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog(null, "Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog(null, "Qual a data da martrícula?");
		String serieMatriculado = JOptionPane.showInputDialog(null, "Qual a série matrículada?");
		String nomeEscola = JOptionPane.showInputDialog(null, "Qual o nome da escola?");

		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNumeroCpf(cpf);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setRegistroGeral(rg);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Programação Java");
		disciplina2.setNota(80);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Compiladores");
		disciplina3.setNota(100);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Arquitetura de Software");
		disciplina4.setNota(70);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println(aluno1.toString());
		System.out.println("Média = " + aluno1.getMedia());
		System.out.println("Resultado = " + aluno1.verificarAprovacaoStr());
	}
}