package br.com.execicios.java2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite 3 números");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem é: " + "\n" + n1 + "\n" + n2 + "\n" + n3);
		}
		
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem é: " + "\n" + n1 + "\n" + n3 + "\n" + n2);
		}
		
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem é: " + "\n" + n2 + "\n" + n1 + "\n" + n3);
		}
		
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem é: " + "\n" + n2 + "\n" + n3 + "\n" + n1);
		}
		
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem é: " + "\n" + n3 + "\n" + n1 + "\n" + n2);
		}
		
		else {
			System.out.println("A ordem é: " + "\n" + n3 + "\n" + n2 + "\n" + n1);
		}
		
		input.close();
	}

}
