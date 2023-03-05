package primeiraClasseJava;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import aprendendoClassses.Aluno;
import aprendendoClassses.Disciplinas;

public class ArrayVetorAula {
	
	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
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
		
		
		//-----------------------------------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplinas d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length ; posnota++) {
					System.out.println("A nota número " + (posnota+1) + " é igual a " + d.getNota()[posnota]);
					 
				}
			}
		}
		
	}

}
