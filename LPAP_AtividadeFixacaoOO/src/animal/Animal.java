package animal;

public class Animal {
	private String raca;
	private int idade;
	private String nome;

	public Animal() {
		super();
	}

	public Animal(String raca, int idade, String nome) {
		super();
		this.raca = raca;
		this.idade = idade;
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String dados() {
		return "Nome: " + nome + " Raça: " + raca + " Idade: " + idade;
	}

}
