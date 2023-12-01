package sistemaAlunos.interfaces;

// essa interface é um contrato que contém métodos e constantes abstratas que podem ser implementadas por uma classe.
public interface PermitirAcesso {
	public boolean autenticar(String login, String senha); // apenas a declaração do método
}