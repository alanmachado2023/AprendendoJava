package aprendendoClassses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Classe/Objeto Aluno*/

public class Aluno {

	/* Esses são os atributos do objeto aluno */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplinas> disciplinas = new ArrayList<Disciplinas>(); // Cria um lista e armazena em array

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { // Cria dados na memória - sendo um padrão Java

	}

	// To string do objeto

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	//Métodos setters e getters d objeto
	// SET é para adicionar ou receber dados para os atributos.
	// GET é para resgatar ou obter o valor do atributo.

	public void setNome(String nome) {
		this.nome = nome; // this é para indicar a classe seguida do atributo. Assim é possível usar nome
							// recebendo nome

	}

	public String getNome() {
		return nome;

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	// Médoto que retorna a média do aluno

	public double getMediaNota() {

		double somaNotas = 0;

		for (Disciplinas disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size(); // .size já retorna a quantidade de disciplinas dinâmicas
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota(); // Método para retornar true ou false para aprovado
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno Aprovado!";
		} else if (media >= 50 && media < 70) {
			return "Aluno em recuperação";
		} else {
			return "Aluno reprovado";
		}
	}

}
