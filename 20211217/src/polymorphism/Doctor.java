package polymorphism;

public class Doctor extends Person{
	
	private String Subject;
	
	public Doctor(String name, int age, String subject) {
		super(name, age);
		this.Subject = subject;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("의사의 과목은 : " + Subject + "입니다.");
		
	}

}
