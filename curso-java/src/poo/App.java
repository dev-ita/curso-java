package poo;

import javax.swing.JOptionPane;

import poo.classes.Aluno;

public class App {
	public static void main(String[] args) {
		/*
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
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota4"));

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
		aluno1.setNota1(nota1);
		aluno1.setNota2(nota2);
		aluno1.setNota3(nota3);
		aluno1.setNota4(nota4);
		
		System.out.println(aluno1.toString());
		System.out.println("Média = " + aluno1.getMedia());
		System.out.println("Resultado = " + aluno1.verificarAprovacaoStr());
		*/

		
		/*Equals e HashCode (diferenciar e comparar objetos)*/
		Aluno aluno1 = new Aluno();		
		aluno1.setNome("italo");
		aluno1.setNumeroCpf("123");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("italo");
		aluno2.setNumeroCpf("123");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos iguais");
		} else {
			System.out.println("Alunos não iguais");
		}
	}
}