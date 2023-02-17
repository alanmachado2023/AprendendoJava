package aprendendoACriar;

import aprendendoClassses.Aluno;

public class ImplementandoClasse {

	//Main é um método auto executável em Java
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); //aqui será o João
		
		Aluno aluno2 = new Aluno(); //aqui será o Pedro
		
		Aluno aluno3 = new Aluno(); //aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria"); // aqui já inicia com valor padrão usando o Construtor nomePadrão

		Aluno aluno5 = new Aluno("José",50); //aqui iniciou com 2 padrões nomePadrão e idadePadrão
	}

}
