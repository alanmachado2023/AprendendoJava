package aprendendoACriar;

import javax.swing.JOptionPane;

import aprendendoClassses.Aluno;

public class ImplementandoClasse {

	//Main é um método auto executável em Java
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
		String nota1 = JOptionPane.showInputDialog("Qual valor da nota 1? ");
		String nota2 = JOptionPane.showInputDialog("Qual valor da nota 2? ");
		String nota3 = JOptionPane.showInputDialog("Qual valor da nota 3? ");
		String nota4 = JOptionPane.showInputDialog("Qual valor da nota 4? ");
		
		
		Aluno aluno1 = new Aluno(); //criando o objeto aluno
		
		aluno1.setNome(nome);
		aluno1.setIdade (Integer.valueOf(idade));  //precisa fazer a conversão de string para int usando método "integer"
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5ª");
		aluno1.setNomeEscola("JDEV Treinamento");
		aluno1.setNota1(Double.parseDouble(nota1));  //Usa o Double.parseDouble para converter para double o valor da string
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		System.out.println();
		
		/*=======================================================================*/
		
		Aluno aluno2 = new Aluno(); //segundo objeto aluno
		
		aluno2.setNome(nome);
		aluno2.setIdade(49);
		aluno2.setDataNascimento("12/10/1983");
		aluno2.setRegistroGeral("561328");
		aluno2.setNumeroCpf("1579965534");
		aluno2.setNomeMae("Robiscleia");
		aluno2.setNomePai("Arlindolfo");
		aluno2.setDataMatricula("10/05/2018");
		aluno2.setSerieMatriculado("8ª");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		System.out.println("Nome do aluno 2 é = " + aluno2.getNome());
		System.out.println("Idade do aluno 2 é = " + aluno2.getIdade());
		System.out.println("Nascimento do aluno 2 é = " + aluno2.getDataNascimento());
		
		/*=======================================================================*/
		
		Aluno aluno3 = new Aluno(); 
		
		Aluno aluno4 = new Aluno("Maria"); // aqui já inicia com valor padrão usando o Construtor nomePadrão

		Aluno aluno5 = new Aluno("José",50); //aqui iniciou com 2 padrões nomePadrão e idadePadrão
	}

}
