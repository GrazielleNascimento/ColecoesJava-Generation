package treinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01Cor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList <String>();
		
		System.out.println("Digite 5 cores: ");
		
		for(int i=0; i<5; i++) {
			cores.add(sc.next());		
		}

		
		Iterator<String> it = cores.iterator();
		System.out.println("\nLista de Cores: ");
		while(it.hasNext()){// verifica hasNext pega sempre o proximo, termina quando acabar

			System.out.println(it.next());// metodo next retorna o valor 
			
		}
		
		Collections.sort(cores);
		it = cores.iterator();
		System.out.println("\nCores ordenadas: ");
		
		while(it.hasNext()){// verifica hasNext pega sempre o proximo, termina quando acabar

			System.out.println(it.next());// metodo next retorna o valor 
			
		}
		
	}

}
