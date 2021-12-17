package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("왕초보");
		GreenSlime gs1 = new GreenSlime();
		c1.hunt(gs1);
		
		RedSlime rs1 = new RedSlime ();
		c1.hunt(rs1);
		
		PurpleSlime ps1 = new PurpleSlime();
		c1.hunt(ps1);
		
		
		
		

	}

}
