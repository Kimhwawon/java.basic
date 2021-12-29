package study;

import java.util.Scanner;

public class EggCartonCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int egg =30;
		System.out.println("몇개의 계란이 필요합니까");
		int count = scan.nextInt();
		if(egg == 1 ) {
			System.out.println("총 X개의 계란판이 필요합니다.");
			}else {
				System.out.println("계란판이 필요하지 않습니다.");
			}

	}

}
