package binary_tree;

public class Arvore {
	//Attributes
	NoArvore raiz;
	int tamanho;
	
	
	//Constructors
	public Arvore() {
		raiz = null;
		tamanho = 0;
	}
	
	//Methods
	public int tamanho() {return tamanho;}
	
	public boolean insere(int chave, Object valor) {
		if(raiz == null) {
			this.raiz = new NoArvore(chave, valor, null);
			tamanho++;
			return true;
		}
		
		NoArvore aux, pai;
		aux = raiz;
		do {
			pai = aux;
			if(chave < aux.getChave()) aux = aux.getEsquerda();
			else if(chave > aux.getChave()) aux = aux.getDireita();
			else {
				aux.setValor(valor);
				return true;
			}
		}while(aux != null);
		
		aux = new NoArvore(chave, valor, pai);
		if(chave > pai.getChave()) pai.setDireita(aux);
		else pai.setEsquerda(aux);
		tamanho++;
		return true;
	}
	
	
	public NoArvore busca(int chave) {
		NoArvore aux = raiz;
		
		while(aux != null && aux.getChave() != chave) {
			if(chave > aux.getChave()) aux = aux.getDireita();
			else aux = aux.getEsquerda();
			//Se for igual, ja sai do loop por causa da condicao no while
		}
		
		return aux; 
	}
	
	public NoArvore buscaRecursiva(NoArvore subArvore, int chave) {
		
		if(subArvore == null || subArvore.getChave() == chave) {
			return subArvore;
		}
		
		
		boolean chaveEhMaior = chave > subArvore.getChave();
		if(chaveEhMaior) return buscaRecursiva(subArvore.getDireita(), chave);
		else if (!chaveEhMaior) return buscaRecursiva(subArvore.getEsquerda(), chave);
		return null;
		
	}
	
	//funcoes de impressao
		//1)  Caminho central
		public void caminhaCentral() {
			caminhaCentral(raiz);
		}		
		public void caminhaCentral(NoArvore subArvore) {
			if(subArvore != null) {
				caminhaCentral(subArvore.getEsquerda());
				System.out.println(subArvore.getChave() + " ");
				caminhaCentral(subArvore.getDireita());
			}
	}
		
		
		//2) Caminhamento pre-ordem
		public void caminhaPreOrdem() {
			caminhaPreOrdem(raiz);
		}
		public void caminhaPreOrdem (NoArvore subArvore) {
			if(subArvore != null) {
				System.out.println(subArvore.getChave() + " " +
								   subArvore.getValor());
				caminhaPreOrdem(subArvore.getEsquerda());
				caminhaPreOrdem(subArvore.getDireita());
			}
		}
		
		
		//3) Caminhamento pos-ordem
		public void caminhaPosOrdem() {
			caminhaPosOrdem(raiz);
		}
		public void caminhaPosOrdem(NoArvore subArvore) {
			if(subArvore != null) {
				caminhaPosOrdem(subArvore.getEsquerda());
				caminhaPosOrdem(subArvore.getDireita());
				System.out.println(subArvore.getChave() + " " +
						   subArvore.getValor());
			}
		}
		
		
		//4)Caminha indentado
		public void caminhaIdentado() {
			caminhaIdentado(raiz, 0);
		}
		public void caminhaIdentado(NoArvore subArvore, int ident) {
			if(subArvore == null) return;
			for(int i=0; i<ident; i++) System.out.print("  ");
			System.out.println(subArvore.getChave());
			caminhaIdentado(subArvore.getEsquerda(), ident+1);
			caminhaIdentado(subArvore.getDireita(), ident+1);
		}
	
		
	//Minimo e Maximo
		public NoArvore minimo() {
			return minimo(raiz);
		}
		public NoArvore minimo(NoArvore subArvore) {
			while(subArvore != null && subArvore.getEsquerda() != null) {
				subArvore = subArvore.getEsquerda();
			}
			return subArvore;
		}
		
		public NoArvore maximo() {
			return maximo(raiz);
		}
		public NoArvore maximo(NoArvore arvoreAux) {
			while(arvoreAux != null && arvoreAux.getDireita() != null) {
				arvoreAux = arvoreAux.getDireita();
			}
			return arvoreAux;
		}
	
	
	
	
	
}
