package aprendendoACriar;

import java.util.Scanner;

public class PostoDeCombustivel {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;
		System.out.println("Digite o código de abastecimento\n 1 - Álcool\n 2 - Gasolina\n 3 - Diesel\n 4 - Encerrar\n ");
		int codigo = sc.nextInt();


			while (codigo != 4) {
				if (codigo > 0 && codigo < 4) {
				switch (codigo) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
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
