package structure;

public class ClassMain01P196 {
	// personClass의 메서드는 작성할 필요가 없습니다.
	// 이미 personClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		PersonClass p1 = new PersonClass();
		p1.age = 10;
		p1.glasses = true;
		p1.name = "김화원";
		p1.pNum = "56924406";
		p1.uNum = 2;
		
		PersonClass p2 = new PersonClass();
		p2.age = 12;
		p2.glasses = true;
		p2.name = "김자바";
		p2.pNum = "123456";
		p2.uNum = 3;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
	    // * 힌트 :  gteInfo의 소 속은?
		p1.getInfo();
		p2.getInfo();

	}

}
