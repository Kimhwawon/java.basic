package accessmodifier2;

import accessmodifier.Warrior;

public class Main02P197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		Warrior w1 =  new Warrior("화원공쥬");
		// w1.hp = 1000000000000;
		// hp가 package friendly일때
		// package 가 달라서 hp변경불가
		w1.hunt();
		w1.hunt();
		w1.hunt();
		


	}

}