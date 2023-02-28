package primeiraClasseJava;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import aprendendoClassses.Aluno;
import aprendendoClassses.Diretor;
import aprendendoClassses.Disciplinas;
import aprendendoClassses.Secretario;
import classesAuxiliares.FuncaoAutenticacao;
import contantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class AplicaçãoClasses {

	// Main é um método auto executável em Java
	public static void main(String[] args) {
		
		

		String login = JOptionPane.showInputDialog("Digite o login: ");
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
		
				
		
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {   //um new função de autenticação recebendo um 'new Secretario' e valida a autenticação do login e senha, caso True

			
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			// é uma lista que dentro na qual há uma chave que identifica uma sequencia de valores
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 4; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
				
				/*
				String idade = JOptionPane.showInputDialog("Qual a idade? ");
				String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento ");
				String registroGeral = JOptionPane.showInputDialog("Informe o RG ");
				String numeroCpf = JOptionPane.showInputDialog("Informe o CPF ");
				String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
				String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
				String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula? ");
				String serieMatricula = JOptionPane.showInputDialog("Qual série está matriculado? ");
				String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");  
				*/

				Aluno aluno = new Aluno(); // criando o objeto aluno

				aluno.setNome(nome);
				
				/*
				aluno.setIdade(Integer.valueOf(idade)); // precisa fazer a conversão de String para int usando método "integer"
				aluno.setDataNascimento(dataNascimento);
				aluno.setRegistroGeral(registroGeral);
				aluno.setNumeroCpf(numeroCpf);
				aluno.setNomeMae(nomeMae);
				aluno.setNomePai(nomePai);
				aluno.setDataMatricula(dataMatricula);
				aluno.setSerieMatriculado(serieMatricula + "ª");
				aluno.setNomeEscola(nomeEscola);  
				 */
				
				for (int pos = 1; pos <= 3; pos++) {
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
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao); // A variável posicao subtrai para indicar a posiçao correta que começa no 0.
						posicao++; // aqui ela incrementa para acompanhar o reposicionamento dos intens na lista.
						escolha = JOptionPane.showConfirmDialog(null, "Continuar removendo? ");

					}
				}

				alunos.add(aluno);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("------------------------------Lista de Aprovados--------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + ": Resultado: " + aluno.getAlunoAprovado2()
						+ " com média = " + aluno.getMediaNota());
			}

			System.out.println("------------------------------Lista da Recuperacao--------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno " + aluno.getNome() + ": Resultado: Em " + aluno.getAlunoAprovado2()
						+ " com média = " + aluno.getMediaNota());
			}

			System.out.println("------------------------------Lista de Reprovados--------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + ": Resultado: " + aluno.getAlunoAprovado2()
						+ " com média = " + aluno.getMediaNota());
			}
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}

}
