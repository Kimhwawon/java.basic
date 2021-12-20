package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// Static변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2);
		//System.out.println(StaticTest.num1);
		// static 메서드로 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.check();
		
		//s1 생성 후 s1을 이용해 .check()를 호풀해보세요.
		StaticTest s1 = new StaticTest();
			s1.check();
		}

	}

//스태틱테스트에 09번(힙에 정적)
//public static int num2 =0; 먼저 시작
//스테틱 테스트에 19번 (힙에 정적영역)
//public static void check() {
//이거후 
//메인 영역 생성(스택) 07번
//System.out.println(StaticTest.num2);
//메인 10번
//StaticTest.check();
//



