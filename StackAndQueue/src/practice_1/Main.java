package practice_1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//practice_2
		Scanner sc=new Scanner(System.in);
		ArrayStack a=new ArrayStack(100);
		String temp=sc.nextLine();
		char[] chs=temp.toCharArray();
		int i;
		for(i=0;i<chs.length;i++) {
			a.push(chs[i]);
		}
		for(i=0;i<chs.length;i++) {
			System.out.println(a.pop());
		}
		
		
		//practic_3
		StackQueue sq= new StackQueue();
		for(char k='a'; k<='z';k++) {
			sq.enqueue(k);
		}
		for(char k='a'; k<='z';k++) {
			System.out.println(sq.dequeue());
		}
		
		

	}
}

