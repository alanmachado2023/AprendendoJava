package aprendendoClassses;

import cursojava.interfaces.PermitirAcesso;

//classe filha (extends) de Pessoa
public class Secretario extends Pessoa implements PermitirAcesso { //o método 'implements' serve para validar o acesso ao "permitir acesso"
	
	private String registro;
	private String nivelCargo;
	private String experiencia;

	private String login;
	private String senha;
	
	public Secretario(String login, String senha) { //Contrutor com parâmetro
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() { //Construtor padrão de secretário
	}
	
	
		
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		
		return 1800.80 * 0.9;
	}
	@Override
	public boolean autenticar(String login, String senha) { //método criado pela validação de 'PermitirAcesso'
		this.login = login;			//esse método está implementado mas não está sendo utilizado...
		this.senha = senha;  					//...é uma forma alternativa.
		return autenticar();       //Está chamando o método autenticar de baixo
	}
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
	
	

}
