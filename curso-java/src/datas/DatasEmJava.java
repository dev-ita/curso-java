package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		Date data1 = new Date();
		System.out.println(data1);
		System.out.println(data1.getTime());
		System.out.println(data1.getMonth());
		System.out.println(data1.getDay());
		System.out.println(data1.getHours());
		System.out.println(data1.getMinutes());
		System.out.println(data1.getSeconds());
		System.out.println(data1.getYear() + 1900);
		
		System.out.println("-----------------------------------");
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		/*Simple date format*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println(simpleDateFormat.format(data1));
		System.out.println(simpleDateFormat2.format(data1));
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		System.out.println(simpleDateFormat.parse("21/02/2004 23:55:20"));

		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(simpleDateFormat3.parse("1987/02/21"));
		System.out.println("------------ Calendar ------------");
		System.out.println("Data em milisegundos: " + calendar.getTimeInMillis());
		System.out.println("Mês: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora: " + calendar.get(Calendar.MINUTE));
		System.out.println("Segundos: " + calendar.get(Calendar.SECOND));
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("Formataçao: " + simpleDateFormat.format(calendar.getTime()));
		System.out.println(calendar);
	}
}