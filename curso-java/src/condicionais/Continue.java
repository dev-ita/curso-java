package condicionais;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.println("Encontrou o número " + i);
				continue;
			}
			System.out.println(i);
		}
	}
}