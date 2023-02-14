package aprendendoACriar;

import java.util.Scanner;

public class AplicandoCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
	/*O programa calcula o valor da fatura pelo valor fixo até 100 minutos e 2 reais a cada minuto excedido*/
		
		double preco;
		int minutos;
				
		preco = 50.0;
				
		System.out.println("Quantos minutos foram consumidos?"); //O preço muda ao passar de 100 minutos
		minutos = sc.nextInt();
		
			if (minutos > 100){
		    	preco += (minutos - 100) * 2.0;         //total de minutos acima dos 100 menos o os 100, sobrando assim apenas o valor excedido x 2 reais
		     }
		System.out.printf("O valor da fatura é: R$ %.2f%n", preco);   // %.2f limitando a duas casas decimais; %n para quebra de linha
		
		sc.close();
		


	}

}
