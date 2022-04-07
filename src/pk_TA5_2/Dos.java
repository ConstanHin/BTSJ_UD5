package pk_TA5_2;

import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String name = "Constantin";
		
		System.out.println("Bienvenido!");
		System.out.print("Introduce tu nombre:");
		name = scnr.nextLine();
		scnr.close();
		
		System.out.println("Hola " + name);
		

	}

}
