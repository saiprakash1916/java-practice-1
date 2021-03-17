import java.util.Scanner;
class PositiveOrNegativeCount{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many values: ");
		int a = s.nextInt();
		int ar[] = new int[a];
		System.out.println("Elements " + a + " values: ");
		for(int i=0;i<a;i++){
			ar[i]=s.nextInt();
		}
		countPosNeg(ar);
	}
	static int[] countPosNeg(int x[]){
		int count[] = {0,0};
		for (int i=0;i<x.length;i++){
			if (x[i]>0)
				count[0]++;
			else
				count[1]++;
		}
		System.out.println("positive values are: " + count[0]);
		System.out.println("Negative values are: " + count[1]);
		return count;
	}
}