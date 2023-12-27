package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManipulandoLocalDate {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
		System.out.println("Mês: " + dataAtual.getMonth().getValue());
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		System.out.println("ano: " + dataAtual.getYear());
	}
}