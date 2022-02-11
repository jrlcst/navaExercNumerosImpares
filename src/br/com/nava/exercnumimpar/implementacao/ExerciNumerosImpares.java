package br.com.nava.exercnumimpar.implementacao;

import java.util.Scanner;

public class ExerciNumerosImpares {

	public static void main(String[] args) {
		
	    int numeroX;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		numeroX = sc.nextInt();
		
		for(int numeros = 1; numeros <= numeroX; numeros++) {
		    if (numeros % 2 != 0) {
		        System.out.println(numeros); 
		    }
		}
	    System.out.println("Fim");
	}
	
}
