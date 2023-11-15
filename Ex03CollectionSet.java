package GenCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03CollectionSet {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> lista = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();

            if (!lista.add(valor)) {
                i--;
            }
        }

        System.out.println("\nListar dados Set:");

        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}