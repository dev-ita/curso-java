package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo_excel.xls");

		if (!file.exists()) {
			file.createNewFile();
		}

		Pessoa pessoa1 = new Pessoa("italo", "italo@teste.com", 19);
		Pessoa pessoa2 = new Pessoa("isabele", "isabele@teste.com", 18);
		Pessoa pessoa3 = new Pessoa("cristiane", "cristiane@teste.com", 47);
		Pessoa pessoa4 = new Pessoa("rubens", "rubens@teste.com", 47);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // vai ser usado para escrever a planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas"); // criar a planilha

		int row = 0;

		for (Pessoa pessoa : pessoas) {
			Row linha = linhasPessoa.createRow(row++); // criando a linha da planilha
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(pessoa.getNome());

			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(pessoa.getEmail());

			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(pessoa.getIdade());
		} // terminou de montar a planilha

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		hssfWorkbook.close();

		System.out.println("Planilha foi criada");
	}
}