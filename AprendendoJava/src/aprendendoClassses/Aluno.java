package aprendendoClassses;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import contantes.StatusAluno;

/*Classe/Objeto Aluno*/
//classe filha (extends) de Pessoa

public class Aluno extends Pessoa {

	/* Esses são os atributos do objeto aluno */
	
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

	// To string do objeto aluno

	@Override // o Overrride indentifica método sobrescrito. Um método que já existe
	
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao;   //Super indica que vem da super classe Pessoa. Não necessariamente precisa o "super." antes da variável
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// Métodos setters e getters do objeto 
	// SET é para adicionar ou receber dados de atributos.
	// GET é para resgatar ou obter o valor de atributo.

	public void setNome(String nome) {
		this.nome = nome; // this é para indicar o atributo que irá receber o parâmetro de mesmo nome.

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
			somaNotas += disciplina.getMediaNotas();
		}

		return somaNotas / disciplinas.size(); // .size já retorna a quantidade de disciplinas dinâmicas inseridas no método 'for' de entrada de disciplinas
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
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override
	public boolean pessoaMarioIdade() {
		
		return idade >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMarioIdade() ? "Aluno é maior de idade" : "Aluno é menor de idade";
	}

	@Override
	public double salario() {
		
		return 1500.9;
	}
}
