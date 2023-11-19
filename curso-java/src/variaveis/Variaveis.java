package variaveis;

import java.math.BigDecimal;

public class Variaveis {

	/*variável global, acessível a todos*/
	static final double PI = 3.14;

	public static void main(String[] args) {
		System.out.println("Váriaveis em java");
		byte tipoByte = -(Byte.MAX_VALUE + 1);
		short tipoShort = Short.MAX_VALUE;
		int tipoInt = Integer.MAX_VALUE;
		boolean tipoBoolean = true;
		String tipoTexto = "Hello, Java";
		BigDecimal tipoBigDecimal = BigDecimal.ONE;
		double tipoDouble = Double.MAX_VALUE;
		long tipoLong = Long.MAX_VALUE;

		System.out.println(tipoByte);
		System.out.println(tipoShort);
		System.out.println(tipoInt);
		System.out.println(tipoBoolean);
		System.out.println(tipoTexto);
		System.out.println(tipoDouble);
		System.out.println(tipoBigDecimal);
		System.out.println(tipoLong);
		
		metodo();
	}
	
	public static void metodo() {
		System.out.println("valor da variável global é = " + PI);
	}
}