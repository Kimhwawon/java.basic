import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		// 구구단을 작성해보겠습니다.
		// Scanner를 이용해서 int den 에 정수를 받아주세요.
		// dan변수에 2~9 사이의 값이 들어왔는지 확인해서
		// 2~9 라면 구구단 결과값을 보여주고,
		// 그렇지 않다면 "구구단의 유효 범위는 2~9단입니다."
		// 라는 안내문구가 나오도록 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 작성해 보겠습니다.");
		 int den = scan.nextInt();
		 
		 if( 1 < den && den < 10 ) {
		 for(int i = 1; i < 10; i++) {
			 System.out.println(den + " * " + i + " =" + den*i);
		 }
	
		 } else {
			 System.out.println("수의 범위는 2~9로 넣어주세요.");
			 
		 }
        
	}
	}


