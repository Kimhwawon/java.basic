package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		Car c1 = new Car(100, 0, "김화원" );
		//c1.gas = 100;
		//c1.speed = 0;
		//c1.owner = "김화원";
		
		// 차를 뽑자마자 먼저 상태 확인
		c1.getInfo();
		// 엑셀을 두 번 밟아주세요
		c1.accelSpeed();
		c1.accelSpeed();
		// 상태 다시 확인
		c1.getInfo();
		// 브레이크를 밟아주세요.
		c1.breakSpeed();
		// 상태 다시 확인
		c1.getInfo();
		// 개솔린 충전
		c1.putGas();
		c1.getInfo();
		

	}

}
