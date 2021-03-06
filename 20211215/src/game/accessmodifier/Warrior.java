package game.accessmodifier;

public class Warrior extends Commoner{
	
	public Warrior(String  name) {
		super(name);
	}

	public void doubleAttack() {
		System.out.println("전사가 더블어택을 사용합니다.");
		// 경험치값 조정(기존경험치값 +25);
		setExp(getExp()+25);
		
		// 체력값 조정(기존체력값 -4);
		setHp(getHp()-4);
	}
	
		public void punch() {
			System.out.println("김초원이 펀치를 날립니다.");
			setExp(getExp()+2);
			setHp(getHp()-0);
		}
	 public void buriburi() {
		 System.out.println("김초원이 부리부리를 시전합니다.");
		 setExp(getExp()+10);
			setHp(getHp()-0);
	 }
		
		public void hunt() {
			System.out.println("김초원이 사냥을 시작합니다.");
			setHp(getHp()-1);
			setExp(getExp() + 5);
		}
	public void getInfo() {
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마력 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 유저명 : " + getName());
		
	}
}

