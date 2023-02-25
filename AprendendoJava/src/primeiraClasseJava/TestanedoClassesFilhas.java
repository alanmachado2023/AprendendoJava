package primeiraClasseJava;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import aprendendoClassses.Aluno;
import aprendendoClassses.Diretor;
import aprendendoClassses.Pessoa;
import aprendendoClassses.Secretario;

public class TestanedoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alan");
		aluno.setNomeEscola("JDev - treinamento");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("524689");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Secretariado");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMarioIdade() + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMarioIdade());
		System.out.println(secretario.pessoaMarioIdade()); 
		
		System.out.println("O salário do aluno é = " + aluno.salario());
		System.out.println("O salário do diretor é = " + diretor.salario());
		System.out.println("O salário do secretario é = " + secretario.salario());
		
		
		//aplicação do método teste
		teste(aluno);
		teste(diretor);
		teste (secretario);
				
	}
	
	//Criação do método teste
	public static void teste(Pessoa pessoa) {
		System.out.println("O " + pessoa.getNome() + " tem um salário de " + pessoa.salario());
	}

}
