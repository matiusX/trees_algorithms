package binary_tree;

public class mainArvoreBinaria {

	public static void main(String[] args) {
		Arvore arvore1 = new Arvore();
		arvore1.insere(15, "matheus");
		arvore1.insere(6, "ana"); 
		arvore1.insere(18, "carolina"); 
		arvore1.insere(3, "nivio"); 
		arvore1.insere(9, "judith"); 
		arvore1.insere(17, "edleno"); 
		arvore1.insere(20, "joao");
		arvore1.insere(2, "carlos");
		arvore1.insere(4, "fernando"); 
		arvore1.insere(7, "marcio"); 
		arvore1.insere(13, "eduardo");
		arvore1.insere(8, "beatriz"); 
	
		
		arvore1.caminhaIdentado();
		System.out.println(arvore1.minimo());
		
		
	}

}
