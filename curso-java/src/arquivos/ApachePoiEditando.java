package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\arquivo_excel.xls");

		FileInputStream entrada = new FileInputStream(file);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // prepara a entrada do arquivo xls do excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // pega a planilha

		Iterator<Row> linhaIterator = planilha.iterator();

		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();
			
			Cell cell = linha.createCell(numeroCelulas);
			cell.setCellValue("5.478,20");
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		entrada.close();
		hssfWorkbook.close();

		System.out.println("Planilha atualizada");
	}
}