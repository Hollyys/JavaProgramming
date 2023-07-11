package Chapter15;

import java.util.*;

public class CollectionsEx02 {
	static void printList(String name, LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		System.out.println(name);
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Delta");
		myList.add("Bravo");
		myList.add("Echo");
		myList.add("Alpha");
		myList.add("Foxtrot");
		myList.add("Charlie");
		myList.add("Golf");

		int index = 0;
		String word = "Echo";
		printList("Init order", myList);

		// Shuffle
		Collections.shuffle(myList);
		printList("Shuffle", myList);

		index = Collections.binarySearch(myList, word) + 1;
		System.out.println(word + ": " + index + "번째 요소입니다. ");
		System.out.println();

		// Ascending order
		Collections.sort(myList);
		printList("Sort: Ascending order", myList);

		index = Collections.binarySearch(myList, word) + 1;
		System.out.println(word + ": " + index + "번째 요소입니다. ");

	}

}
