package br.com.execicios.java2;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite três valores: ");
		int num01 = input.nextInt();
		int num02 = input.nextInt();
		int num03 = input.nextInt();
		
		
		if(num01 >= num02 && num01 >= num03 ) {
			System.out.println("O número maior foi: " + num01);
		}
		
		if(num02>= num01 && num02 >= num03 ) {
			System.out.println("O número maior foi: " + num02);
		}
		
		else {
			System.out.println("O número maior foi: " + num03);
		}
	
		input.close();
		
	}

}
