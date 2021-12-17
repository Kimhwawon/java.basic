package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음.
		Person t1 = new Teacher("나선생", 26,"컴퓨터");
		Person d1 = new Doctor("나의사", 32,"내과");
		
	t1.showPerson();
	d1.showPerson();

}
}