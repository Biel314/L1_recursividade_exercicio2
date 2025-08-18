package controller;

public class ArrayController {
	
	public ArrayController() {
		super();
	}
	
	public int arrRecursiva(int arr[], int n, int menor) {
		//A condicao de parada e atingida quando o tamanho do vetor chega a 0
		if(n == 0) {
			return menor;
		}
		//Comparacao entre o menor (desde o que veio ate o q foi substituido) com um outro indice do vetor
		if (arr[n-1] < menor) {
			menor = arr[n-1];
		}
		
		///chamamos novamente a funcao percorrendo um novo valor do vetor ate completa-lo
		return arrRecursiva(arr, n-1, menor);
		
	}
	
}
