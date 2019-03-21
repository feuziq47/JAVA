package practice_1;

public class ArrayStack implements Stack{
	private char[] S;
	private int top=-1;
	public ArrayStack(int N) {
		S=new char[N];
	}
	
	@Override
	public int size() {
		
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		
		return top<0;
	}

	@Override
	public char top() {
		
		return (char)S[top];
	}

	@Override
	public char push(char o) {
		top=top+1;
		S[top]=o;
		return o;
	}

	@Override
	public char pop() {
		char o=(char)S[top];
		top=top-1;
		return o;
	}
	
		


}
