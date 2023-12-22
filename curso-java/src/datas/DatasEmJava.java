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
		
		Calendar data2 = Calendar.getInstance();
		System.out.println(data2.getTime());
		
		/*Simple date format*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println(simpleDateFormat.format(data1));
		System.out.println(simpleDateFormat2.format(data1));
		System.out.println(simpleDateFormat.format(data2.getTime()));
		
		System.out.println(simpleDateFormat.parse("21/02/2004 23:55:20"));

		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(simpleDateFormat3.parseObject("1987/02/21"));
	}
}