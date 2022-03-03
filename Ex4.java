package br.com.execicios.java2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero =0, resultado = 0;
		
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		
		resultado = numero % 2;
		
		if(resultado == 0) {
			System.out.println("Esse número é par");
			resultado = (int) Math.sqrt(numero);
			System.out.println(resultado);
			
		}
		
		if(resultado == 1) {
			System.out.println("Esse número é ímpar");
			resultado = numero * numero;
			System.out.println(resultado);
		}

				
	}

}
