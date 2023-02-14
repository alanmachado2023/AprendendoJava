package aprendendoACriar;

import java.util.Scanner;

public class QuadranteCartesiano_If_Else {

	public static void main(String[] args) {

		/*O programa mostra em qual quadrante cartesiano a coordenada "xy" se encontra, ou se será em cima de um dos eixos*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a coordenada x: ");
		int x = sc.nextInt();
		System.out.println("Digite a coordenada y: ");
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {                  //O programa encerrará quando x=0 e y=o
			if (x == 0 && y > 0) {
				System.out.println("Semi-eixo 'y' positivo");
			}
			else if (x == 0 && y < 0) {
				System.out.println("Semi-eixo 'y' negativo");
			}
			else if (x > 0 && y == 0) {
				System.out.println("Semi-eixo 'x' positivo");
			}
			else if (x < 0 && y == 0) {
				System.out.println("Semi-eixo 'x' negativo");
			}
			else if (x >= 0 && y >= 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (x <= 0 && y >= 0) {
					System.out.println("Segundo Quadrante");
			}
			else if (x <= 0 && y <= 0) {
					System.out.println("Terceiro Quadrante");
			}
			else {
					System.out.println("Quarto Quadrante");
			}
			
			System.out.println();
			System.out.println("Digite outra coordenada x ou 0 para encerrar: ");
			x = sc.nextInt();	
			System.out.println("Digite outra coordenada y ou 0 para encerrar: ");
			y = sc.nextInt();
			}
			
		System.out.println("Fim! Obrigado e até a próxima");
			sc.close();
		}

}
