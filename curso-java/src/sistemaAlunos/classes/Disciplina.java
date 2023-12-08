package sistemaAlunos.classes;

import java.util.Arrays;
import java.util.Objects;

import sistemaAlunos.excecao.ExcecaoSetarNota;

public class Disciplina {
	private double[] nota = new double[4];
	private String disciplina;

	public Disciplina() {
		
	}

	public Disciplina(String disciplina, double[] nota) {
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public double getMedia() {
		double somaTotal = 0.0;
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
		}
		return somaTotal / nota.length;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) throws ExcecaoSetarNota {
		if (nota.length > this.nota.length) {
			throw new ExcecaoSetarNota("Estourou o tamanho permitido de notas que é 4");
		}
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + Arrays.toString(nota) + ", disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}	
}