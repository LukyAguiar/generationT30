package classes;

public class Produto {

	// Atributos
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;

	// Construtores
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
		this.nome = nome;
	}

	// Encapsuladores
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// M�todos
	public void retirarEstoque(int qntd) {
		if (qntd > estoque) {
			System.out.println("Quantidade Incorreta");
		} else {
			this.estoque -= qntd;
		}
	}
	
	public void modificaEstoque(int qntd) {
		if (qntd > estoque) {
			System.out.println("Quantidade Incorreta");
		} else {
			this.estoque += qntd;
		}
	}
}