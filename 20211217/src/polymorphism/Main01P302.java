package polymorphism;

public class Main01p302 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 10, 100);
		
		//p1원과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson();//Person측 showPerson()호출
		s1.showPerson();//Student측 showPerson()호출
	}
	//신분 밝히기용 showStudent()를 호출시도해보세요.
	//s1은 Person타입이므로 Person에 소속된 자원만 호출 할 수 있습니다.
	//s1.showStudent();
}
