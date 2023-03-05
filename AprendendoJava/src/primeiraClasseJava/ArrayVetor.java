package primeiraClasseJava;

import javax.swing.JOptionPane;

import aprendendoClassses.Aluno;
import aprendendoClassses.Disciplinas;

public class ArrayVetor {
	
	public static void main(String[] args) {
		//Array pode ser de todos os tipos de dados e objetos também
		
		
		//array deve ter a quantidade de posições definidas
		//O elemento em array é sempre a posição -1, pois começa em zero.
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		
		double notas[] = new double [Integer.parseInt(posicoes)]; //[] pode ser na frente da variável ou do tipo, ficaria double[] notas;
		
			
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + pos );
			notas[pos] = Double .valueOf(valor);
		}
		
		
		for (int pos = 0; pos < notas.length; pos++) {    //lenght usa o tamanho de "notas" para estabeler a repetição
			System.out.println("Nota " + (pos+1) + " é = " + notas[pos]);
		}
		
		/*========================================================================================================================================*/
		
		
		
		String[] valores = new String[4]; 
		
		valores[0] = "alex";
		valores[1] = "90";
		valores[2] = "Curso de Java";
		valores[3] = "contato@blabla.com.br";
		
		/*ou*/
		
		String[] parametros = /*new String*/{"alex", "90", "Curso Java" + "contato@blabla.com.br"};  //outra maneira de fazer
		
		/*========================================================================================================================================*/
		
		int[] inteiros = new int[10]; 	//outros tipos de arrays
		float[] floats = new float[10]; 
		
		/*========================================================================================================================================*/
		
	//	double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {8.8, 8.9, 7.3, 9.0};
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Alan Machado");
		aluno.setNomeEscola("JDevTreinamento");
		
		
		Disciplinas disciplina = new Disciplinas();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);  //adiciona na lista de disciplina do aluno
		
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso = " + aluno.getNomeEscola());
		for (Disciplinas d : aluno.getDisciplinas()) {
			
			System.out.println("--------------------Disciplinas do aluno--------------------");
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As notas da disciplina são : ");
			
			
			//bloco para achar a maior nota da disciplina
			double notaMax= 0.0;          
			for (int pos = 0 ; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
				
				if (pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			
			System.out.println("A maior nota da disciplina " + d.getDisciplina() + " foi " + notaMax);
		}
		
	}
	
}
		
		