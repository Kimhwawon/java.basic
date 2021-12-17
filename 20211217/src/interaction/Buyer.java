package interaction;

public class Buyer {
	private int money;
	private int banana;
	private int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.banana = 0 ;
		this.apple = 0;
	}
public void buybanana(Seller seller, int banana ) {
	if((banana*4500) > this.money){
		System.out.println(" 돈이 모자랍니다. 소지금 :" + this.money);
		return;
		
	}

	
	
}
	
	
	
}
