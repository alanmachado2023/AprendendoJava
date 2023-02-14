package aprendendoACriar;

import java.util.Scanner;

public class PostoDeCombustivel_While_If_Case {

	public static void main(String[] args) {
		
/*O programa calcula o total de abastecimentos de cada tipo de combustível*/
		
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;
		System.out.println("Digite o código de abastecimento\n 1 - Álcool\n 2 - Gasolina\n 3 - Diesel\n 4 - Encerrar\n ");
		int codigo = sc.nextInt();


			while (codigo != 4) {
				if (codigo > 0 && codigo < 4) {   //Limita os valores válidos entre 1 e 4 
				switch (codigo) {
				case 1:                     
					alcool += 1;
					break;
				case 2:
					gasolina += 1;        //analisa a variável "código" para cada "case" específico e incrementa com +1
					break;
				case 3:					  //É uma estrutura "switch-case", dentro da condicional "if-else", dentro da estrutura de repetição "while"
					diesel += 1;
					break;
				}
				System.out.println("Digite o código de abastecimento\n 1 - Álcool\n 2 - Gasolina\n 3 - Diesel\n 4 - Encerrar\n ");
				codigo = sc.nextInt();
				}
				else {
					System.out.println("Código inválido");  
					codigo = sc.nextInt();
					
				}
				
			}
			System.out.println("Álcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
			System.out.println("Muito Obrigado");
			
			sc.close();

	}

}
