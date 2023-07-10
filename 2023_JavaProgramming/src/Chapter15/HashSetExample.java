package Chapter15;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>(); //객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		// 방법 #1: iterator를 이용한 객체 하나씩 가져오기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println( element);
			if(element.equals("JSP")) { // 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}

		System.out.println(); //객체 제거
		set.remove("JDBC");
		
		// 방법 #2: for문을 이용한 객체 하나씩 가져오기
		for(String element : set) {
			System.out.println(element);
		}

	}

}
