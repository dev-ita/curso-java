package variaveis;

import java.math.BigDecimal;

public class Variaveis {
	public static void main(String[] args) {
		System.out.println("Váriaveis em java");
		byte tipoByte = Byte.MAX_VALUE;
		short tipoShort = Short.MAX_VALUE;
		int tipoInt = Integer.MAX_VALUE;
		boolean tipoBoolean = true;
		String tipoTexto = "Hello, Java";
		BigDecimal tipoBigDecimal = BigDecimal.ONE;
		double tipoDouble = Double.MAX_VALUE;

		System.out.println(tipoByte);
		System.out.println(tipoShort);
		System.out.println(tipoInt);
		System.out.println(tipoBoolean);
		System.out.println(tipoTexto);
		System.out.println(tipoDouble);
		System.out.println(tipoBigDecimal);
	}
}