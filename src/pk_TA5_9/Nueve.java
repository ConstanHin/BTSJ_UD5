package pk_TA5_9;

public class Nueve {

	public static void main(String[] args) {
		
		// Muestra los numeros del 1 al 100 divisibles entre 2 y 3

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
