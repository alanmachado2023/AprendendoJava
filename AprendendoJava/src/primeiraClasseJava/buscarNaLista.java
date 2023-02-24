package primeiraClasseJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aprendendoClassses.Aluno;
import aprendendoClassses.Disciplinas;

public class buscarNaLista {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 1; qtd++) {
			;
		

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
			
			 String idade = JOptionPane.showInputDialog("Qual a idade? "); 
			 String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento ");
			 String registroGeral = JOptionPane.showInputDialog("Informe o RG "); 
			 String numeroCpf = JOptionPane.showInputDialog("Informe o CPF "); 
			 String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? "); 
			 String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? "); 
			 String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula? "); 
			 String serieMatricula = JOptionPane.showInputDialog("Qual série está matriculado? ");
			 String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? "); 
			 

			Aluno aluno = new Aluno(); // criando o objeto aluno

			aluno.setNome(nome);
			
			aluno.setIdade (Integer.valueOf(idade)); //precisa fazer a conversão de String para int usando método "integer"
			aluno.setDataNascimento(dataNascimento);
			aluno.setRegistroGeral(registroGeral); aluno.setNumeroCpf(numeroCpf);
			aluno.setNomeMae(nomeMae); aluno.setNomePai(nomePai);
			aluno.setDataMatricula(dataMatricula);
			aluno.setSerieMatriculado(serieMatricula + "ª");
			aluno.setNomeEscola(nomeEscola); 
			

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ? ");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ? ");

				Disciplinas disciplina = new Disciplinas();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			int posicao = 1; // variável para fazer o incremento e decremento.

			if (escolha == 0) {
				while (escolha == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4? ");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);  // A variável posicao subtrai para indicar a posiçao correta que começa no 0.
					posicao++;         //aqui ela incrementa para acompanhar o reposicionamento dos intens na lista.
					escolha = JOptionPane.showConfirmDialog(null, "Continuar removendo? ");
				}
			}
			
			alunos.add(aluno);
		  
			}
			
		 	for (int pos = 0; pos < alunos.size(); pos++) {
				
				Aluno aluno = alunos.get(pos);
				
				if (aluno.getNome().equalsIgnoreCase("alex")) {
					Aluno trocar = new Aluno();
					trocar.setNome("Aluno foi trocado");
					
					Disciplinas disciplinas = new Disciplinas();
					disciplinas.setDisciplina("Matemática");
					disciplinas.setNota(96);
					
					trocar.getDisciplinas().add(disciplinas);
					
					alunos.set(pos, trocar);
					aluno = alunos.get(pos);
				}
				
				System.out.println("Aluno = " + aluno.getNome());
				System.out.println("Média do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("============================================================");
				
				for (Disciplinas disc : aluno.getDisciplinas()) {
					System.out.println("Matéria = " + disc.getDisciplina() + " Nota = " + disc.getNota());
				}
		 	}
			
		
	}

}

		 