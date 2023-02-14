package aprendendoACriar;

import java.util.Scanner;

public class QuadranteCartesiano_If_Else {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a coordenada x: ");
		int x = sc.nextInt();
		System.out.println("Digite a coordenada y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
					System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
					System.out.println("Terceiro");
			}
			else {
					System.out.println("Quarto");
			}
			System.out.println("Digite a coordenada x: ");
			x = sc.nextInt();	
			System.out.println("Digite a coordenada y: ");
			y = sc.nextInt();
			
			sc.close();
		}

	}

}
