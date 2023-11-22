package poo;

import poo.classes.Aluno;

public class App {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();

		aluno1.setNome("italo");
		aluno1.setIdade(19);
		aluno1.setDataMatricula("10/02/2020");
		aluno1.setDataNascimento("21/02/2004");
		aluno1.setNomeEscola("Maroja neto");
		aluno1.setNomeMae("Cristiane");
		aluno1.setNomePai("Rubens");
		aluno1.setNumeroCpf("060.123.321-00");
		aluno1.setSerieMatriculado("3º ano");
		aluno1.setRegistroGeral("12932128");
		aluno1.setNota1(50);
		aluno1.setNota2(50);
		aluno1.setNota3(50);
		aluno1.setNota4(50);
		
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println("Aprovado: " + (aluno1.verificarAprovacao() ? "Aprovado" : "Reprovado"));
		System.out.println("Aprovado2: " + aluno1.verificarAprovacaoStr());
		System.out.println(aluno1.getNome() + ", " + aluno1.getIdade());

		Aluno aluno2 = new Aluno();
		aluno2.setNome("isabele");
		aluno2.setIdade(17);
		aluno2.setDataMatricula("21/02/2022");
		aluno2.setDataNascimento("24/12/2005");

		System.out.println(aluno2.getNome() + ", " + aluno2.getIdade());
	}
}