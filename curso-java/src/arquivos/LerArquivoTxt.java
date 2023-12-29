package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaDoArquivo = new FileInputStream(
				new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaDoArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) { // gerando os objetos Pessoa a partir dos dados coletados do arquivo.txt
				String[] dados = linha.split("\\;");
				pessoas.add(new Pessoa(dados[0], dados[1], Integer.parseInt(dados[2])));
			}
		}
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}

		lerArquivo.close();
	}
}