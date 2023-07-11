package Chapter15;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx01 {
	public static void printList(String name, LinkedList<String> list) {
		System.out.println(name);
		System.out.println(list);
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>(); myList.add("Delta");
		myList.add("Bravo");
		myList.add("Echo");
		myList.add("Alpha");
		myList.add("Foxtrot");
		myList.add("Charlie");
		myList.add("Golf");
		printList("Init order", myList);
		
		// Shuffle: 랜덤하게 섞기
		Collections.shuffle(myList);
		printList("Shuffle", myList);
		
		// Reverse
		Collections.reverse(myList);
		printList("Reverse order", myList);
		
		// Ascending order
		Collections.sort(myList);
		printList("Sort: Ascending order", myList);
		
		// Descending order
		Collections.sort(myList, Collections.reverseOrder());
		printList("Sort: Descending order", myList);

	}

}
