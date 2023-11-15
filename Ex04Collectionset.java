package treinamento;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04Collectionset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		
		System.out.println("Informe o  Número que deseja encontrar: ");
		Integer numProcurado = sc.nextInt();
		
		if(numeros.contains(numProcurado)) {
			System.out.println("O Número " + numProcurado + " foi encontrado!");
		}else {
			System.out.println("Número não encontrado");
		}
		
	}

}
