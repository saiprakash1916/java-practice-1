import java.util.Scanner;
class ZigZag{
	public static void main(String args[]){
		System.out.println("Read first array: ");
		int a[] = readArray();
		System.out.println("Read second array: ");
		int b[] = readArray();
		int c[] = zigzagOrder(a,b);
		System.out.print("First array element: ");
		dispArray(a);
		System.out.print("Second array element: ");
		dispArray(b);
		System.out.print("Merge array element is: ");
		dispArray(c);
	}
	static int[] readArray(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many values: ");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + " values: ");
		for(int i=0;i<n;i++){
			ar[i] = s.nextInt();
		}
		return ar;
	}
	static void dispArray(int ar[]){
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
	}
	static int[] zigzagOrder(int a[], int b[]){
		int c[] = new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&&i<b.length){
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
		}
	
	while(i<a.length){
		c[k]=a[i];
		k++;
		i++;
	}
	while(i<b.length){
		c[k]=b[i];
		k++;
		i++;
	}
	return c;
	}
}