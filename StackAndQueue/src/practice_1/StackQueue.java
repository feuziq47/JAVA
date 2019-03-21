package practice_1;

public class StackQueue implements Queue {
	
	ArrayStack instack = new ArrayStack(1000);
	ArrayStack outstack= new ArrayStack(1000);
	
	
	@Override
	public int size() {
		return instack.size()+outstack.size();
	}

	@Override
	public boolean isEmpty() {
		return (instack.isEmpty()&&outstack.isEmpty());
	}

	@Override
	public char front() {
		return instack.top();
	}

	@Override
	public void enqueue(char o) {
		while(!(outstack.isEmpty())){
			char temp=outstack.pop();
			instack.push(temp);
		}
		instack.push(o);
		
	}

	@Override
	public char dequeue() {
		while(!(instack.isEmpty())){
			
			outstack.push(instack.pop());
		}
		char b= outstack.pop();
		return b;
		
	}
	
}
