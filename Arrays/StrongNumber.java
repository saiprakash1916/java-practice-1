import java.util.Scanner;
class StrongNumber{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many values: ");
		int a = s.nextInt();
		int ar[] = new int[a];
		System.out.println("Elements " + a + " values: ");
		for(int i=0;i<a;i++){
			ar[i]=s.nextInt();
		}
		System.out.println("Strong numbers present in the array is " + countStrong(ar));
	}
	static int countStrong(int x[]){
		int count = 0;
		for (int i=0;i<x.length;i++){
			boolean rs = isStrongNumber(x[i]);
			if (rs)
				count++;
		}
		return count;
	}
	static int factStrong(int y){
		int fact = 1;
		while(y>0){
			fact=fact*y;
			y--;
		}
		return fact;
	}
	static boolean isStrongNumber(int z){
		int sum = 0, t = z;
		do{
			int r = z%10;
			sum = sum +factStrong(r);
			z=z/10;
		}while(z != 0);
		return sum == t;
	}
}