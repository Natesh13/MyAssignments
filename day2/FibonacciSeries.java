package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
	int n1=0, n2=1, range=8, sum=0;
	
	System.out.println(n1);
	
	for(int i=0; i<=8; i++)
	{
	sum=n1+n2;
	n1=n2;
	n2=sum;

	System.out.println(sum);
	
	
	}

}
}