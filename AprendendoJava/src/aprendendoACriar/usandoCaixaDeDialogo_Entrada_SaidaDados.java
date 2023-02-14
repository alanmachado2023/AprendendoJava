package aprendendoACriar;

import javax.swing.JOptionPane;

public class usandoCaixaDeDialogo_Entrada_SaidaDados {

	public static void main(String[] args) {
		
		/*O programa pergunta o que será dividido e depois divide o total inserido de objetos entre o total inserido de pessoas e mostra o resultado da divisão e quantos sobraram*/
		
		String objeto = JOptionPane.showInputDialog("O que será dividido entre as pessoas? (digite o nome do objeto no singular) "); //atribui o nome ao objeto para ser usado nas respostas
		
		
		String objeto2 = JOptionPane.showInputDialog("Informe a quantidade de " + objeto + "(s)");  //Caixas de entrada
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double objetoNumero = Double.parseDouble(objeto2);    //Converte o valor de entrada de "string" para "double" e atribui a nova variável double
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (objetoNumero / pessoaNumero);    //divide a nova variável convertendo a divisão em inteiro
		
		double resto =  objetoNumero % pessoaNumero;
		
		
		/*Caixa para o resultado da divisão*/
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		if (resposta == 0) {
			if (divisao > 1) {
				JOptionPane.showMessageDialog(null,"Cada um deve receber " + divisao + " " + objeto +"(s).");      //caixa de saída
			}
			else {
				JOptionPane.showMessageDialog(null,"Cada um deve receber " + divisao + " " + objeto);       //Estrutura if-else apenas para colocar corretamente a concordância do plural e singular
			}	
		}
		else {
			JOptionPane.showMessageDialog(null, "Você cancelou a visualização do resultado da divisão");
		}
		
		/*Caixa para o resto da divisão*/ 
		if (resto == 0) {                                      //Caso seja zero não irá perguntar, informará automaticamente que não há resto
				JOptionPane.showMessageDialog(null, "Não sobrou " + objeto);
		}
		else {                                                 //Se o resto não for zero, aparecerá a caixa de confirmação para ver o resto
			resposta = JOptionPane.showConfirmDialog(null, "Você deseja ver quanto sobrou?");
				if (resposta == 0) {
					if (resto > 1) {
					JOptionPane.showMessageDialog(null,"Sobraram " + (int) resto + " " + objeto + "(s).");      
					}
					else {
						JOptionPane.showMessageDialog(null,"Sobrou " + (int) resto + " " + objeto);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Você cancelou a visualização do resultado. O programa encerrou");
				}
		}	
		
		JOptionPane.showMessageDialog(null, "Isso é tudo. Obrigado!");
	}
	
}
