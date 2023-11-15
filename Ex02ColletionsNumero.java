package GenCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02ColletionsNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Digite o número que vcê deseja encontrar: ");
		Integer num = sc.nextInt();

		boolean encontrado = false;
		for (int i = 0; i < 10; i++) {
			if (list.get(i) == num) {
				System.out.println("O número " + num + " está localizado na posição: " + i);

				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}
}
