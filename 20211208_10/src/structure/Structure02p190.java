package structure;

public class Structure02p190 {
	
	// person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name +"의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
		 
	}
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요.(a,b)
		Person a = new Person();
		a.name = "김화원";
		a.age = 26;
		a.pNum = "56924406";
		a.uNum = 2;
		
		Person b = new Person();
		b.name = "김초원";
		b.age = 26;
		b.pNum = "40708158";
		b.uNum = 3;
		
		getInfo(a); //a의 주소값을 getInfo의 p에 전달
		getInfo(b); //b의 주소값을 getInfo의 p에 전달
		
		
		
		
		

	}

}
