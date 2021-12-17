package structure;

public class Structure03p190 {
	
	public static void getInfo(Cat c) {
		System.out.println(c.name +"의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : " + c.age + "성별 : " + c.gender );
	}

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		
		c1.name = "엘리자";
		c1.age = 2;
		c1.gender = "females";
		
		Cat c2 = new Cat();
		
		c2.name = "베스";
		c2.age = 4;
		c2.gender = "females";
		
		getInfo(c1);
		getInfo(c2);
		
		
		
				
				
	}

}
