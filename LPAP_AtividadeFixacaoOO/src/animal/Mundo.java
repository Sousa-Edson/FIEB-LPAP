package animal;

public class Mundo {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setRaca("vira-lata");
		a1.setNome("Totó");
		a1.setIdade(1);
		
		Animal a2 = new Animal();
		a2.setRaca("Buldog");
		a2.setNome("Rex");
		a2.setIdade(3);
		
		
		System.out.println("Animal 1 "+a1.dados());
		System.out.println("Animal 2 "+a2.dados());
	}

}
