package aprendendoACriar;

import java.util.Scanner;

public class UsandoFor_Incremento {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de número a ser somados: ");
		int N = sc.nextInt();
		
		int soma = 0;
		
		System.out.println("Digite o primeiro número da soma: ");
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			System.out.println("Digite o próximo número da soma: ");
			
	    }
		System.out.println(soma);
		
		sc.close();
		}

}
