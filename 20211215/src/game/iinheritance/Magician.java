package game.iinheritance;

public class Magician extends Commoner{
	
	private int mDam;
	
	public void getInfo() {
		System.out.println("아이디 : " + name + "레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp + ", 마법데미지 : " + mDam);
	}
	public Magician(String name) {
		super(name);
		mDam = 6;
	}

}
