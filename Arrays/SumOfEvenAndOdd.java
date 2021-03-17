import java.util.Scanner;
class SumOfEvenAndOdd{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many values: ");
		int a = s.nextInt();
		int ar[] = new int[a];
		System.out.println("Elements " + a + " values: ");
		for(int i=0;i<a;i++){
			ar[i]=s.nextInt();
		}
		int c[] = sumEvenOdd(ar);
		System.out.println("Sum of even numbers are: " + c[0]);
		System.out.println("Sum of odd numbers are: " + c[1]);
	}
	static int[] sumEvenOdd(int x[]){
		int sumeven=0,sumodd=0;
		for (int i=0;i<x.length;i++){
			if (x[i]%2 == 0)
				sumeven = sumeven + x[i];
			else 
				sumodd = sumodd + x[i];
		}
		int sum[] = {sumeven,sumodd};
		return sum;
	}
}