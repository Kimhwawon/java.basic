
public class WhileQ2P {

	public static void main(String[] args) {
		// 반복문의 경우 3개의 요소가 필요합니다.
		// 1. 조건식(참 거짓 판단으로 실행 유지 여부 결정)
		// 2. 변수 (조건식을 처음에는 true였다가 일정 시점뒤에 필요에 따라 false로 만들기 위해서)
		// for문과같은경우 위 3개 요소를 한 줄에 담는다면
		// while은 따로 떨어트려 두는것이 특징입니다.
		// 따라서 한 줄에 있냐, 떨어져있만 뺴면 사실상 같은 구문입니다.
		
		// i while문 변수 생성
		int i = 2; // 구구단이므로 시작값 2
		// i while문의 조건식 생성 (범위 2~9를 갖게 하기 10이되면 false가 되도록 설계)
		while(i < 10) {
			
			// j while문 변수 생성
			int j = 1; // i가 x단이므로, j는 1부터 시작합니다.
			while(j <10) {// j while문의 조건식 생성(범위 1~9를 가지게 합니다.)
				System.out.println(i + "*" + j + "=" + i * j); 
				j++;
			}
			System.out.println("===========");
			// for문은 다 돌고나서 i값을 증가시키기 때문에 우선 아래쪽에 둡니다.
			i++; // i = i + 1; // i +=1; 셋 중 하나를 기입해서
			// i값을 증가시킵니다.
		}

	}

}
