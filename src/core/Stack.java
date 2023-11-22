package core;
import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> stack;

	public Stack() {
		stack = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public void push(Integer item) {
		// TODO Auto-generated method stub
		stack.add(item);
	}

	@Override
	public Integer pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public Integer peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.get(stack.size() - 1);
	}

}
