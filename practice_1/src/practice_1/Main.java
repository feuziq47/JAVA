package practice_1;

public class Main {
	int a,b;
	static long y;
	public static long power(int x, int n) {

		if(n==0) {
			return 1;
		}else {
			if(n%2 !=0) {
				y= power(x, (n-1)/2);
				return x*y*y;
			}else {
				y= power(x,n/2);
				return y*y;
			}
		}
	}
	public static void main(String[] args) {
		int a=5;
		int b=16;
		System.out.println(power(a,b));
		

	}

}
