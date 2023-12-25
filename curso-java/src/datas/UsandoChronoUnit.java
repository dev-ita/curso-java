package datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class UsandoChronoUnit {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar dataPassada = Calendar.getInstance();
		dataPassada.set(2023, 11 - 1, 25);
		Calendar dataHoje = Calendar.getInstance();

//		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-11-25"), LocalDate.now());

		long dias = ChronoUnit.DAYS.between(LocalDate.parse(dateFormat.format(dataPassada.getTime())), LocalDate.parse(dateFormat.format(dataHoje.getTime())));
		
		System.out.println("Possuí " + dias + " dias entre a faixa de data");
	}
}