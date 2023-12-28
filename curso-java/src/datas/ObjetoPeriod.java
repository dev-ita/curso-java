package datas;

import java.time.LocalDate;
import java.time.Period;

public class ObjetoPeriod {
	public static void main(String[] args) {
		// LocalDate dataAntiga = LocalDate.parse("2020-02-07");
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		LocalDate dataNova = LocalDate.now();
		
		System.out.println("Data antiga: " + dataAntiga);
		System.out.println("Data nova: " + dataNova);

		System.out.println("Data antiga é maior que a data nova? " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é menor que a data nova? " + dataAntiga.isBefore(dataNova));
		System.out.println("Data nova é maior que a data antiga? " + dataNova.isAfter(dataAntiga));
		System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("O periodo é: " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
		System.out.println("periodo total em meses: " + periodo.toTotalMonths());
	}
}