package aprendendoClassses;

/*Classe/Objeto Aluno*/

public class Aluno {
	/*Esses são os atributos do objeto aluno*/
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	public Aluno() {  //Cria dados na memória - sendo um padrão Java
		
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao, int idadePadrao){
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	
}


