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
		aluno1.setIdade (Integer.valueOf(idade));           //precisa fazer a conversão de string para int usando método "integer"
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatricula + "ª");
		aluno1.setNomeEscola(nomeEscola); 
		
		
		for (int pos = 1; pos <= 4; pos++){
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ? ");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ? ");
			
			Disciplinas disciplina = new Disciplinas();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);   // valueOf indica a disciplina pra remover e o intValue chama o inteir refente a posição. o -1 é para alterar a posição de escolha começando o 1
		}
		
		System.out.println(aluno1.toString());
		System.out.println("A média do aluno é = " + aluno1.getMediaNota());
		System.out.println("A situação do aluno é = " + aluno1.getAlunoAprovado2());
		
		/*=======================================================================*/
	}

}
