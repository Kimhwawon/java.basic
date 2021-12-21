package interface1;

// Vehicle을 구현하기 위해 implements 를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name = name;
		this.gas = MAX_GAS;
		this.speed = 0;
		}
	// 오버라이드 해서 사용해야하는 구현메서드
	@Override
	public void accel() {
		// 속도제한은 300이며 가속할 경우 50씩 증가합니다.
		if(speed + 50 > 300 ) {
			speed = 300;
			}else {
				speed += 50;
			}
		// 가속 후 연료 차감
		//-7씩 차감
		      gas -= 7;
	}

	@Override
	public void breakSpeed() {
		// 감속도 50씩
		if (speed - 50 < 0){
		    speed = 0;
	}else {
		speed -= 50;
		
	}}
	


	@Override
	public void reFuel() {
		// 연료량은 70씩 채웁니다.
		if(gas + 70 > MAX_GAS ) {
			gas = MAX_GAS;
			} else {
				gas += 70;
			}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed );
		System.out.println("현재 연료 : " + gas );
		System.out.println("현재 차주 : " + name );
		System.out.println("----------------------"  );
		
	}
	
}

