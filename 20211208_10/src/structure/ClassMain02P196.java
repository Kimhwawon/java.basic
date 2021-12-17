package structure;

public class ClassMain02P196 {
	
	public static void main(String[] args) {
		// 차 2대 생성
		Car c1= new Car();
		c1.model = "aaa";
		c1.price = 100;
		c1.owner = "김화원";
		Car c2= new Car();
		c2.model = "ccc";
		c2.price = 300;
		c2.owner = "김초원";
		// 콘솔에 정보 찍기
		c1.getInfo();
		c2.getInfo();
     	    
		
	}

}
