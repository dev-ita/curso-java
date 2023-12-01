package sistemaAlunos.classesAuxiliares;

import sistemaAlunos.interfaces.PermitirAcesso;

// Realmente e somente receber alguem que tenha o contrato com a interface de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticarLogin() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}