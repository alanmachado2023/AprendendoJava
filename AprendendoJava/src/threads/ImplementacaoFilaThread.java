package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>(); 
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	
	
	@Override   //executa a thread
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		while(true) {
		
			Iterator iteracao = pilha_fila.iterator();
			
			synchronized (iteracao) {  //Bloquea o acesso a esta lista por outros processos. Apenas essa thread irá acessar essa pilha
				
				while (iteracao.hasNext()) {    //itecao.hasNext indica que enquanto houverem dados na lista, processará.
			
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
			
					//aqui entram os processos:
			
					System.out.println("------------------------------------");
			
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
			
			
					iteracao.remove();
			
			
					try {
						Thread.sleep(1000);  			//serve para dar um tempo para descarga de memória, para não sobrecarregar
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1000);             //tempo para limpeza de memória após processar toda a lista
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}
