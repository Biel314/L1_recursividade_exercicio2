package view;

import java.util.Scanner;
import controller.ArrayController;

// Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
// tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
// valor con�do neste vetor.

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		ArrayController ArrayController = new ArrayController();
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + " termo do vetor:");
			arr[i] = in.nextInt();	
		}
		
		int ultima = arr[n-1];
		
		int menorValor = ArrayController.arrRecursiva(arr, n, ultima);
		
		System.out.println("O menor valor do vetor e: " + menorValor);
 	}

}
