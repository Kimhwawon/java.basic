package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("자장면", 5000);
		map.put("짬뽕", 6000);
		map.put("탕수육", 8000);
		map.put("유린기", 12000);
		map.put("깐풍기", 15000);
		

		
		
		System.out.println("자장면 가격 : " + map.get("자장면"));
		System.out.println("짬뽕 가격 : " + map.get("짬뽕"));
		System.out.println("탕수육 가격 : " + map.get("탕수육"));
		
		System.out.println(map);
		
		
		
		

	}

}
