package interface1;

public class Airplane implements Vehicle {
	// 최대 연료량 10000
	// 최대 속도 900
	private int speed;
	private int gas;
	private String name;
	
	public Airplane (String name) {
		this.name = name;
		this.gas = MAX_GAS;
		this.speed = 0;
		}

	
	

	//가속 400
	// 감속 300
	// 연료는 150씩 소비
	
	// 연료 충전시 500씩 충전

	
	@Override
	public void accel() {
		if(speed + AIRPLAN_INCREASE_SPD > AIRPLAN_MAX_SPD) {
			speed =  AIRPLAN_MAX_SPD;
		}else {
			speed += AIRPLAN_INCREASE_SPD;
	    }
		// 가속 로직을 전부 확인한 다음
		gas -= AIRPLAN_DECREASE_GAS;
		
	}

	@Override
	public void breakSpeed() {
		if (speed - AIRPLAN_DECREASE_SPD < MIN_SPD){
		    speed = MIN_SPD;
	}else {
		speed -= AIRPLAN_DECREASE_SPD;
	}
		
	}

	@Override
	public void reFuel() {
		if(gas + AIRPLAN_INCREASE_GAS > AIRPLAN_INCREASE_GAS ) {
			gas = AIRPLAN_MAX_GAS;
			} else {
				gas += AIRPLAN_INCREASE_GAS;
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
