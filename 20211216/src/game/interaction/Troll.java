package game.interaction;

public class Troll {
        private int hp;
		private int atk;
		private int def;
		
		public Troll () {
			this.hp = 7;
			this.atk = 2;
			this.def = 1;
		}
		// doBattle은 유저의 공력력을 받아 오크이 체력을 차감합니다. 
		public void doBattle(int uAtk) {
			// Ttoll의 체력을 유저 공격력 만큼 차감시켜주세요.
			hp = (hp + def) - uAtk;
			if(hp <= 0) {
				System.out.println("트롤이 죽어서 더이상 반응하지 않습니다.");
			   
			System.out.println("트롤의 남은 체력 : " + hp);

}
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