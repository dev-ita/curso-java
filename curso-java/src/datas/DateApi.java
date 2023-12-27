package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateApi {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual = " + dataAtual);

		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual = " + horaAtual);

		LocalDateTime fullDate = LocalDateTime.now();
		System.out.println("Data completa = " + fullDate);

		System.out.println("Data formatada: " + fullDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}
}