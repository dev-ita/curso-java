package condicionais;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		try {
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota1"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota2"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota3"));
			double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota4"));

			double media = (nota1 + nota2 + nota3 + nota4) / 4;

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aprovado com a média: " + media);
			} else if (media >= 50 && media < 70) {
				JOptionPane.showMessageDialog(null, "Em recuperação com a média: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno reprovado com a média: " + media);
			}
		} catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Número inválido, preencha corretamente\n" + error);
		}
	}
}