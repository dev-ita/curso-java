package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TrabalhandoComLocalDate {
	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.parse("2023-12-28");
		System.out.println("Mais 5 dias: " + dataBase.plusDays(5));
		System.out.println("Mais 5 semanas: " + dataBase.plusWeeks(5));
		System.out.println("Mais 5 anos: " + dataBase.plusYears(5));
		System.out.println("Mais 2 meses: " + dataBase.plusMonths(2));
		System.out.println("Menos 1 ano: " + dataBase.minusYears(1));
		System.out.println("Menos 2 meses: " + dataBase.minusMonths(2));
		System.out.println("Menos 20 dias: " + dataBase.minusDays(2));
		System.out.println("Data base: " + dataBase);

		for (int parcela = 0; parcela < 12; parcela++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data do vencimento do boleto: "
					+ dataBase.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM")) + " do mês " + (parcela + 1));
		}
	}
}