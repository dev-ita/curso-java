package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaDoArquivo = new FileInputStream(
				new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaDoArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}

		lerArquivo.close();
	}
}