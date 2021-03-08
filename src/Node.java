
public class Node {
	
	protected int valor;
	protected Node esquerda;
	protected Node direita;
	protected Node pai;
	protected Node raiz;
	
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Node getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}

	public Node getDireita() {
		return direita;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}
	
	public Node getPai() {
		return pai;
	}

	public void setPai(Node pai) {
		this.pai = pai;
	}

	public Node(int valor) {
		this.valor = valor;
	}
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	
	
	public void insert(int valor) {
		insert(raiz, valor);
	}
	
	private void insert(Node no, int valor) {
		if (no == null) {
			raiz = new Node(valor);
		}else {
			if(valor < no.valor) {
				if(no.esquerda != null) {
					insert(no.esquerda, valor);
				}else {
					Node novoNo = new Node(valor);
					no.esquerda = novoNo;
					novoNo.esquerda.pai = no;
				}
				
			}else {
				if(no.direita != null) {
					insert(no.direita, valor);
				}else {
					Node novoNo = new Node(valor);
					no.direita = novoNo;
					novoNo.direita.pai = no;
				}
			}
		}
	}
	
	public Node pesquisa(int valor) {
	    return pesquisa(raiz, valor);
	}
	
	private Node pesquisa(Node no, int valor) {
	    if (no == null) return null;
	    if (valor == no.valor) return no;
	    if (valor < no.valor) return pesquisa(no.esquerda, valor);
	    else return pesquisa(no.direita, valor);
	}
	
	public int alturaArvore() {
		return 0;
	}
	public String toString() {
		String s = "";
		
		
		return s;
	}
}
