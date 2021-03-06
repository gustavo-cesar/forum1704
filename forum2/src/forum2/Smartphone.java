package forum2;

public class Smartphone {

	private String nomeSmartphone;
	private String marca;
	private double preco;

	public Smartphone() {
	}

	public Smartphone(String nomeSmartphone, String marca, double preco) {
		setNomeSmartphone(nomeSmartphone);
		setMarca(marca);
		setPreco(preco);
	}

	public String getNomeSmartphone() {
		return nomeSmartphone;
	}

	public void setNomeSmartphone(String nomeSmartphone) {
		if (nomeSmartphone.isEmpty()) {
			throw new RuntimeException("Nome n�o deve ser vazio");
		}
		this.nomeSmartphone = nomeSmartphone;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.isEmpty()) {
			throw new RuntimeException("Marca n�o deve ser vazia");
		}
		this.marca = marca;
	}

	public void setPreco(double preco) {
		if (preco <= 0.00) {
			throw new RuntimeException("Valor n�o pode ser menor que zero");
		}
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Smartphone [Nome Smartphone=" + nomeSmartphone + ", marca=" + marca + ", preco=" + preco + "]";
	}
	
	
}
