package threads;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		//thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);   //Cria o objeto da ThreadEmail, aplica o método thread1
		threadEmail.start();                     //inicia o método  da threadEmail
		
		/*============================================DIVISÃO DAS THREADS============================================*/
		
		
		Thread threadNotaFiscal = new Thread(thread2); //thread processando em paralelo do envio de nota fiscal //Cria Objeto threadNotaFiscal, aplica o método thread2
		threadNotaFiscal.start();                    //Inicia o método da threadNotaFiscal

		/*============================================FIM DAS THREADS============================================*/
		
		//código do sistema que continua em execução
		System.out.println("Chegou ao fim do código de teste de Thread");
		
		//fluxo do sistema, cadastro de venda, emissão de nota fiscal ou algo do tipo
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usurário");
		
	}
	
	
	private static Runnable thread1 = new Runnable() {
		
		//no método run vai o código da rotina. 
		@Override
		public void run() {
			
			//código que será executado em segundo plano
			for (int pos = 0; pos < 10; pos++) {
	
					
				System.out.println("Executando alguma rotina de envio de emails");
		
				try {
					Thread.sleep(2000);     //sleep permite temporizar o processo em milissegundos. É um recurso de Thread.
				} catch (InterruptedException e) {
			e.printStackTrace();
				}   
		
		} 
			
		}
	};
	
	
	private static Runnable thread2 = new Runnable() {
		
		//no método run vai o código da rotina. 
		@Override
		public void run() {
			
			//código que será executado em segundo plano
			for (int pos = 0; pos < 10; pos++) {
	
					
				System.out.println("Executando alguma rotina de envio de nota fiscal");
		
				try {
					Thread.sleep(2500);     //sleep permite temporizar o processo em milissegundos. É um recurso de Thread.
				} catch (InterruptedException e) {
			e.printStackTrace();
				}   
		
		} 
			
		}
	};

}
