package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// main쪽에서 Commoner 와 Orc를 만들어서 교전시켜주세요.
		// Commoner 생성
		Commoner c1 = new Commoner("초심자") ;
 	    // Orc 생성
		Orc o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);
		
	}

}
