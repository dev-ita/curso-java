package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EscrevendoArquivoTxt {
	public static void main(String[] args) throws IOException {
		
		LocalDateTime data = LocalDateTime.now();

		Pessoa pessoa1 = new Pessoa("italo", "italo@teste.com", 19);
		Pessoa pessoa2 = new Pessoa("isabele", "isabele@teste.com", 18);
		Pessoa pessoa3 = new Pessoa("cristiane", "cristiane@teste.com", 47);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo.txt");
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		escreverNoArquivo.write("a data de hoje é: " + data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS")));
		escreverNoArquivo.write("\n");
		escreverNoArquivo.write("Segunda linha\n");
		
		for (Pessoa pessoa : pessoas) {
			escreverNoArquivo.write(pessoa.getNome() + ";" + pessoa.getEmail() + ";" + pessoa.getIdade() + "\n");
		}
		
		escreverNoArquivo.flush(); // persistir o arquivo
		
		escreverNoArquivo.close(); // fechar o arquivo
	}
}