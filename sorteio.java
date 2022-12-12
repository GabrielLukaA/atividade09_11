package atividaade09_11;

import java.util.Random;
import java.util.Scanner;

public class sorteio {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numero, palpite, tentativas = 1;

		numero = sorte();

		for (; tentativas >= 0; tentativas++) {
			System.out.println("Informe um palpite para o número sorteado: ");
			palpite = in.nextInt();
			System.out.println(tentativas);
			if (numero == palpite) {
				System.out.println("Parabéns, você acertou em " + tentativas + " tentativas.");
				tentativas = -3;
			} else if (numero != palpite) {
				if (palpite < numero) {
					System.out.println("Seu palpite é inferior ao número sorteado, tente novamente.");
				} else if (numero < palpite) {
					System.out.println("Seu palpite é superior ao número sorteado, tente novamente.");
				}
			}
		}

	}

	public static int sorte() {

		Random gerador = new Random();

		int sorte = gerador.nextInt(1000);
		return sorte;
	}

}
