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
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD ) {
			speed = TRAIN_MAX_SPD;
			}else {
				speed += TRAIN_INCREASE_SPD;
			}
		// 가속 후 연료 차감
		//-7씩 차감
		      gas -= TRAIN_DECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		// 감속도 50씩
		if (speed - TRAIN_DECREASE_SPD < MIN_SPD){
		    speed = MIN_SPD;
	}else {
		speed -= TRAIN_DECREASE_SPD;
		
	}}
	


	@Override
	public void reFuel() {
		// 연료량은 70씩 채웁니다.
		if(gas + TRAIN_INCREASE_GAS > MAX_GAS ) {
			gas = MAX_GAS;
			} else {
				gas += TRAIN_INCREASE_GAS;
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

