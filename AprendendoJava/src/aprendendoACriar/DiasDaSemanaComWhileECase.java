package aprendendoACriar;

import java.util.Scanner;

public class DiasDaSemanaComWhileECase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7 para indicar o dia da semana ou 0 para encerrar: ");
		int x = sc.nextInt();
		String dia;
		
		while (x!=0) {
			switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda Feira";
			break;
		case 3:
			dia = "Terça Feira";
			break;
		case 4:
			dia = "Quarta Feira";
			break;
		case 5:
			dia = "Quinta Feira";
			break;
		case 6:
			dia = "Sexta Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		System.out.println(dia);
		System.out.println();
		System.out.println("Digite um número de 1 a 7 para indicar o dia da semana ou 0 para encerrar: ");
			x = sc.nextInt();
		}
		System.out.println("A aplicação encerrou.");
		
		sc.close();
		
	}

}
