package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		Acher a1 = new Acher();
		Troll t1 = new Troll();
		Orc o1 = new Orc();
		Slime s1= new Slime();
		    a1.huntOrc(o1);
			a1.huntTroll(t1);
			a1.huntSlime(s1);
		
		Magician m1 = new Magician();
		m1.huntSlime(s1);
		m1.huntOrc(o1);
		m1.huntTroll(t1);
		
		

	}

}
