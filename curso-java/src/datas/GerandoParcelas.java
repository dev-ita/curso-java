package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {
	public static void main(String[] args) throws ParseException {
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2023");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int i = 0; i < 12; i++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela nº " + i + " vencimento é em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
}