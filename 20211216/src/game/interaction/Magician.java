package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;

	public Magician() {
		this.hp= 20;
		this.mp=10;
	    this.def=1;
	    this.exp=0;
	    this.atk=4;
	}
	
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk); //트롤이 마법사를 공격하는 로직
		if(troll.getHp() > 0 ) { // 트롤 체력이 0보다 큰지 검사(0보다크다면)
			this.hp = this.hp + this.def - troll.getAtk() ; //정상 교전 진행
		}else { // 0보다 작거나 같다면
			System.out.println("트롤이 이미 죽어서 교전이 긑났습니다."); // 트롤이 죽었음을 알림
		}
		
		System.out.println("교전 결과 법사의 체력 : " + this.hp); // 교전결과 브리핑
	}
	
	public void huntOrc(Orc orc) {
		//  마법사가 오크를 때리기 위해서 먼저 orc의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		// 전사도 오크에게 공격을 받습니다.
	this.hp = this.hp + this.def - orc.getAtk() ;
		System.out.println("교전 결과 벖사의 체력 : " + this.hp);
	}
	public void huntSlime(Slime slime) {
		slime.doBattle(atk);
		this.hp = this.hp + this.def - slime.getAtk() ;
		System.out.println("교전 결과 법사의 체력 : " + this.hp);
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	
	
	
	
	
	
	
	
	
}
