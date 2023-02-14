package aprendendoACriar;

import java.util.Scanner;

public class AplicandoCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		double preco;
		int minutos;
				
		preco = 50.0;
				
		System.out.println("Quantos minutos foram consumidos?"); //O preço muda ao passar de 100 minutos
		minutos = sc.nextInt();
		
			if (minutos > 100){
		    	preco += (minutos - 100) * 2.0;
		     }
		System.out.printf("O valor da fatura é: R$ %.2f%n", preco);
		
		sc.close();
		


	}

}
