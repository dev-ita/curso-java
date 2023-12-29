package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {
	public static void main(String[] args) throws IOException {
		FileInputStream entrada = new FileInputStream(
				new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // preparando a entrada do arquivo para poder ler
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // peAga a primeira planilha

		Iterator<Row> linhaIterator = planilha.iterator();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (linhaIterator.hasNext()) { // enquanto tiver linha
			Row linha = linhaIterator.next(); // dados da pessoa na linha
			Iterator<Cell> celula = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celula.hasNext()) {
				Cell cell = celula.next();
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			} // percorreu todas as celulas da linha atual
			pessoas.add(pessoa);
		}

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

		entrada.close();
		hssfWorkbook.close();
	}

}