package game.accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		// Magician을 생성해주세요.
		Magician m1 = new Magician("어피치");
		// 교전 전에 getInto()로
		// 정보부터 조회해주세요
		m1.getInfo();
		// hunt()로 사냥해주세요.
		m1.hunt();
		m1.fireball();
		m1.heal();
		// 사냥이 끝난 후 다시
		// 정보를 조회해주세요.
		m1.getInfo();

	}

}
