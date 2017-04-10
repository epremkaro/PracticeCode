package geeksforgeeks;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{
	
	private Stack<Integer> min;
	
	public SpecialStack() {
		min = new Stack<Integer>();
	}
	
	
	@Override
	public Integer push(Integer item){
		if(this.isEmpty()){
			super.push(item);
			min.push(item);
		}
		else{
			super.push(item);
			int y = min.pop();
			min.push(y);
			if (item <= y)
				min.push(item);
		}
		
		return item;
	}
	
	@Override
	public synchronized Integer pop() {
		
		if (this.isEmpty())
			return null;
		
		int x = super.pop();
		int y = min.pop();
		
		if (x != y)
			min.push(y);
		return x;
	}
	
	public int getMin(){
		int m = min.pop();
		min.push(m);
		return m;
	}
	
	public static void main(String[] args) {
		SpecialStack s = new SpecialStack();
		
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		
		System.out.println(s.getMin());
		System.out.println(s.size());
		
		s.pop();
		System.out.println(s.getMin());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.getMin());
	}
	

}
