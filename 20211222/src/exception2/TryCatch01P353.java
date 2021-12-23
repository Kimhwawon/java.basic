package exception2;

import java.util.Scanner;

public class TryCatch01P353 {

	public static void main(String[] args) {
		// try~catch 구문은 크게 예외가 발생할 가능성이 있는 구문을 적어두는
		// try블럭과, 예외가 실제로 발생했을때 대처할 코드를 실행하는
		// catch블럭으로 나뉩니다. 
		
		// 스캐너로 int a, b에 정수를 입력받는 부분까지만 작성해주세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		
		try {
			 // 예외가 발생할 가능성이 있는 구문을 전부 떄려넣습니다.
			System.out.println("실행 시작!");
			System.out.println(a/b);
			System.out.println("계산 끝!");
		} catch (Exception e) {
			
	       } finally {
	    	  
	    	   System.out.println("코드 끝!");
	    	   
	       }

}}
