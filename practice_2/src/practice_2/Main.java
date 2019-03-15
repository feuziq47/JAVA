package practice_2;


public class Main {

	public static long BinarySum(int A[], int i, int n) {
		if(n==1) {
			return A[i];
		}else {
			return BinarySum(A,i,(int)Math.ceil((float)n/2))+BinarySum(A,(int)(i+Math.ceil((float)n/2)),n/2);
		}
	}

	
	public static void main(String[] args) {
		int k;
		int[] B=new int[100];
		for(k=0;k<B.length;k++) {
			B[k]=k+1;
		}
		System.out.println(BinarySum(B,0,100));
		

	}

}
