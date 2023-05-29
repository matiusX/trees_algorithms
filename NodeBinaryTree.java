package binary_tree;

public class NoArvore {
	//Attributes
	private int chave;
	private Object valor;
	private NoArvore esquerda;
	private NoArvore direita;
	private NoArvore pai; 
	
	//Constructors
	public NoArvore(int chave, Object valor, NoArvore pai) {
		this.chave = chave;
		this.valor = valor;
		this.pai = pai;
	}
	
	//Methods
	public int getChave() {return this.chave;}
	public void setChave(int chave) {this.chave = chave;}
	

	public Object getValor() {return this.valor;}
	public void setValor(Object valor) {this.valor = valor;}
	

	public NoArvore getEsquerda() {return this.esquerda;}
	public void setEsquerda(NoArvore esquerda) {this.esquerda = esquerda;}
	
	public NoArvore getDireita() {return this.direita;}
	public void setDireita(NoArvore direita) {this.direita = direita;}
	
	public NoArvore getPai() {return this.pai;}
	public void setPai(NoArvore pai) {this.pai = pai;}
	
}
