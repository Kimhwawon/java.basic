package game.iinheritance;

public class Acher extends Commoner {
	
	private int rDam;
	
	public void getInfo() {
		System.out.println("아이디 : " + name + "레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp + ", 원거리데미지 : " + rDam);
		
	}
	public Acher(String name) {
		super(name);
		rDam = 8;
	}

}
