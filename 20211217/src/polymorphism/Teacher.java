package polymorphism;

// Person을 상속
public class Teacher extends Person{
	
	// 선생님 과목
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	public void showPerson() {
		super.showPerson(); //부모쪽 조회메서드 호출
		System.out.println("선생님의 과목 : " + subject + "입니다.");
		
	}
	

}
