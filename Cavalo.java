package Familia52;

public class Cavalo extends Animal {
	
	private String acao;
	
	public Cavalo (String nome, int idade, String som, String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	@Override
	public String getSom() {
		return "Pocoto";
		
	}
}