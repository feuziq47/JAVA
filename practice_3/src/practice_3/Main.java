package practice_3;

public class Main {
	static int i=0;
	static int j=1;
	static long[] A=new long[2]; 
	
	public static long[] LinearFib(int n) {
		
		if(n<=1) {
			A[0]=n;
			A[1]=0;
			return A;
		}else {
			long temp;
			A = LinearFib(n-1);
			temp=A[0];
			A[0]=temp+A[1];
			A[1]=temp;
		}
		return A;
	}
	
	public static void main(String[] args) {
		int n=5;
		LinearFib(n);
		System.out.println(A[0]);

	}

}
