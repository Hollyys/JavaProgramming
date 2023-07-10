package Chapter13;

public class GenericStack<T> {
	int tos;
	Object[] stack;
	int size;

	public GenericStack(int size) {
		tos = 0;
		this.size = size;
		stack = new Object[size];
	}
	public void push(T item) {
		if(tos == this.size)
			return;
		stack[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stack[tos];
	}
	public int size() {
		return tos;
	}

}
