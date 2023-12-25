package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimento = simpleDateFormat.parse("21/02/2024");
		Date dataAtual = simpleDateFormat.parse("24/12/2023");
		
		Calendar dataVencimento2 = Calendar.getInstance();
		dataVencimento2.set(2024, 1, 26);
		Calendar dataAtual2 = Calendar.getInstance();
		
		System.out.println("Data do vencimento do boleto: " + simpleDateFormat.format(dataVencimento2.getTime()));
		System.out.println("Data atual: " + simpleDateFormat.format(dataAtual2.getTime()));
		
		if (dataVencimento2.after(dataAtual2)) { // data de vencimento é maior que minha data atual
			System.out.println("Boleto não venceu!");
		} else {
			System.out.println("Boleto vencido! - PAGA CALOTEIRO");
		}
		
		if (dataVencimento2.before(dataAtual2)) {
			System.out.println("Boleto vencido 2");
		}
	}
}