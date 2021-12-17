package game.interaction;

public class Slime {
	private int hp;
	private int atk;
	private int def;
	
	public Slime () {
		this.atk = 7;
		this.hp = 4;
		this.def = 1;
	}
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
		if(hp <= 0) {
		System.out.println("트롤이 죽어서 더이상 반응하지 않습니다.");
	    return;
		}
		System.out.println("슬라임의 남은 체력 : " + hp);
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
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

}
