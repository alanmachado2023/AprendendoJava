package primeiraClasseJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import aprendendoClassses.Aluno;
import aprendendoClassses.Disciplinas;

public class AplicaçãoClasses {

	// Main é um método auto executável em Java
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento ");
		String registroGeral = JOptionPane.showInputDialog("Informe o RG ");
		String numeroCpf = JOptionPane.showInputDialog("Informe o CPF ");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula? ");
		String serieMatricula = JOptionPane.showInputDialog("Qual série está matriculado? ");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");
		
		
		Aluno aluno1 = new Aluno(); //criando o objeto aluno
		
		aluno1.setNome(nome);
		aluno1.setIdade (Integer.valueOf(idade));  //precisa fazer a conversão de string para int usando método "integer"
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatricula + "ª");
		aluno1.setNomeEscola(nomeEscola);
		
		
		Disciplinas disciplina1 = new Disciplinas();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setDisciplina("Matemática");
		disciplina1.setNota(80);
	
		Disciplinas disciplina3 = new Disciplinas();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		Disciplinas disciplina4 = new Disciplinas();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		
		System.out.println(aluno1.toString());
		System.out.println("A média do aluno é = " + aluno1.getMediaNota());
		System.out.println("A situação do aluno é = " + aluno1.getAlunoAprovado2());
		
		/*=======================================================================*/
	}

}
