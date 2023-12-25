package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipulandoCalendar {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("25-12-2023")); // definindo uma data qualquer

		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // antes

		calendar.add(Calendar.DAY_OF_MONTH, 5);

		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // depois

		calendar.add(Calendar.MONTH, 1);

		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // depois

		calendar.add(Calendar.YEAR, 1);

		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime())); // depois
	}
}