import java.util.Scanner;
class Fibonacci	{
	int n1,n2,n3,limit;
	Fibonacci(int n) {
	limit=n;
	n1=0;
	n2=1;
	}
	void series() {
		System.out.println("THE FIBONNACI SERIES UP TO "+limit+" ARE:");
		System.out.println(n1+" "+n2+" ");
		int i;
		for (i=3;i<=limit;i++){
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;


		}
	}
}
class FibonacciSeries {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
	        int n = input.nextInt();
	        Fibonacci f = new Fibonacci(n);
		f.series();
	}
 
}
