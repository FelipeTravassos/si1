package InterfaceLinhaDeComando;

import java.util.Scanner;

import sistema.SistemaEscreveNumero;

public class Sistema {
	public static void main(String[] args) {
		SistemaEscreveNumero sis = new SistemaEscreveNumero();
		Scanner sc = new Scanner(System.in);
		
		String numero = "";
		do {
			System.out.println("Digite um n�mero inteiro entre 0 e 1000000000");
			numero = sc.nextLine();
			System.out.println(sis.getNumeroEscrito(numero));
			
		} while (numero != "");
	}
}
