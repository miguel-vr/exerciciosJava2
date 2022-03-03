package br.com.execicios.java2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = input.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.println("Infantil");
	}
		
		if(idade >=15 && idade <= 17) {
			System.out.println("Juvenil");
	}
		
		if(idade >=18 && idade <= 25) {
			System.out.println("Adulto");
	}
		
		else {
			System.out.println("Idade inválida...");
		}
		
		input.close();
	}
}
