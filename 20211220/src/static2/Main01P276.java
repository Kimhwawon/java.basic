package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asen 조원 샹성 없이도 팀 점수는 public으로 처리된 ㅣ경우 바로 조회 가능
		System.out.println(Asean.PersentationScore);
		
		Asean a1 = new Asean (19, 30, 17);
		Asean a2 = new Asean (20, 29, 28);
		Asean a3 = new Asean (15, 30, 20);
		Asean a4 = new Asean (20, 30, 30);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}

}
