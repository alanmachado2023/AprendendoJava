package classesAuxiliares;

import cursojava.interfaces.PermitirAcesso;

//Para somente receber alguém que realmente tem o contrato de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar(); //usa o autenticar do secretário
	}	
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
