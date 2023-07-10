package Chapter13;

public class GenericStackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 타입의 Generic Stack 생성
		System.out.println("String Stack");
		GenericStack<String> stringStack = new GenericStack<String>(3);
		stringStack.push("Seoul");
		stringStack.push("Busan");
		stringStack.push("Daegu");

		int size = stringStack.size(); for(int n=0; n < size; n++) {
			System.out.print("Stack size:" + stringStack.size());
			System.out.println(" -> pop(): " + stringStack.pop());
			// Integer 타입이 Generic Stack 생성
		}
		
		System.out.println("\nInteger Stack");
		GenericStack<Integer> intStack = new GenericStack<Integer>(3);
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		for(int n=0; n<3; n++) {
			System.out.println(intStack.pop());
		}
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println("intStack size: " + intStack.size());

	}

}
