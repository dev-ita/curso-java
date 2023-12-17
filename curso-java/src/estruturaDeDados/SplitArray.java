package estruturaDeDados;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		String texto = "italo, isabele, cristiane, rubens";
		String[] array = texto.split(",");
		for (var item : array) {
			System.out.println(item);
		}
		
		// convertendo array em lista
		List<String> list = Arrays.asList(array);

		for (var item : list) {
			System.out.println(item);
		}
		
		// convertendo lista para array
		String[] conversaoArray = list.toArray(new String[4]);
		System.out.println(conversaoArray[2]);
	}
}