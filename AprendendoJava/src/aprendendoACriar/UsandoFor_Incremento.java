package aprendendoACriar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsandoFor_Incremento {

	public static void main(String[] args) {
		
/*O usurário predefine uma quantidade de número a serem somados e depois solicita os numeros para o cálculo de acordo com a quantidade*/	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de número a ser somados: ");
		int N = sc.nextInt();         //Quantos número serão somados
		
		int soma = 0;
		
		
		System.out.println("Digite o primeiro número da soma: ");   //entrada dos número que fará parte do cálculo
		for (int i=0; i<N; i++) {          //cria a variável "i", a condição de repetição e incrementa até o máximo de repetições inserida pelo usuário. ex: 5 vezes                         
			int x = sc.nextInt();                              
			soma = soma + x;      //faz a soma dos número que o usuário inseriu
			System.out.println("Digite o próximo número da soma: ");
			
	    }
		System.out.println("A soma dos " + N + " números é: " + soma);
		
			
		sc.close();
		}

}
