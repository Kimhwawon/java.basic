package interaction;

public class Seller {
	private int money;
	private int banana;
	private int apple;
	
	
	public Seller(int banana) {
		this.money=0;
		this.banana=banana;
		this.apple=apple;
		
		}
	public void sellBanana(int banana) {
		if (this.banana < banana ) {
			System.out.println("바나나가 모자랍니다.");
			return;
		}
		this.banana -= banana;
		this.money += banana * 4500;
		}
	
	
	public void sellApple(int apple) {
		if (this.apple <  apple) {
			System.out.println("사과가 모자랍니다.");
			return;
			}
		this.apple -= apple;
		this.money += apple * 2000;
	}
	
	public void showSeller() {
		System.out.println("-----상인정보------");
		System.out.println("현재 소지금 : " + this.money + ", 현재바나나재고 : " + this.banana);
		System.out.println("-------------------");
	}
	public void showSeller1() {
		System.out.println("-----상인정보------");
		System.out.println("현재 소지금 : " + this.money + ", 현재사과재고 : " + this.apple);
		System.out.println("-------------------");
	}
	//public int getbanana() {
	  //return this banana;
	// public int getapple(){
	  // return this apple;  
	
	}
	
	

}
