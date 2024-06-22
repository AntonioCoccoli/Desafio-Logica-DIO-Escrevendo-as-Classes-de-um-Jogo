package entities;

public class Hero {
	
	public String nome;
	public Integer idade;
	public String tipo;
	public String tipoAtaque;
	
	public Hero() {
		
	}

	public Hero(String nome, Integer idade, String tipo) {
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
	}
	
	
	
	public void atacar() {
		if (tipo.equals("MAGO") || tipo.equals("Mago") || tipo.equals("mago")) {
			tipoAtaque = "Magia";
		}
		else if (tipo.equals("GUERREIRO") || tipo.equals("Guerreiro") || tipo.equals("guerreiro")) {
			tipoAtaque = "Espada";
		}
		else if (tipo.equals("MONGE") || tipo.equals("Monge") || tipo.equals("monge")) {
			tipoAtaque = "Artes Marciais";
		}
		else if (tipo.equals("NINJA") || tipo.equals("Ninja") || tipo.equals("ninja")) {
			tipoAtaque = "Shuriken";
		}
		
	}
	
	@Override
	public String toString() {
		return "O "
				+ tipo
				+ " atacou usando "
				+ tipoAtaque;
	}
	
	
	

}
