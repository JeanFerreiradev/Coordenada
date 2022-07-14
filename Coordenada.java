package beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coordenada {
	static Scanner console = new Scanner(System.in);
	static DecimalFormat formatador = new DecimalFormat("0.0");

	public static void main(String[] args) {
		double x = 0.0;
		double y = 0.0;
		System.out.println("Digite a coordenada X:");
		x = console.nextDouble();
		System.out.println("Digite a coordenada Y:");
		y = console.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("\tO ponto est� na origem do plano!");
		} else if (x > 0 && y == 0) {
			System.out.println("\tO ponto est� sobre o eixo X!");
		} else if (x == 0 && y > 0) {
			System.out.println("\tO ponto est� sobre o eixo Y!");
		} else if (x > 0 && y > 0) {
			System.out.println("\tO ponto est� no quadrante 1!");
		} else if (x > 0 && y < 0) {
			System.out.println("\tO ponto est� no quadrante 4!");
		} else if (x < 0 && y > 0) {
			System.out.println("\tO ponto est� no quadrante 2!");
		} else {
			System.out.println("\tO ponto est� no quadrante 3!");
		}

	}

}
