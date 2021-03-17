import java.util.Scanner;
class Specifiedindex{
public static void main(String args[]){
	Scanner s =new Scanner(System.in);
	System .out.println("Enter the how many values: ");
	int a = s.nextInt();
	int ar[] = new int[a];
	System.out.println("Enter " + a + " values ");
	for (int i=0; i< a; i++){
		ar[i]=s.nextInt();
	}
	System.out.println("Enter the specific number: ");
	int b = s.nextInt();
	int rs = search(ar,b);
	System.out.println(rs);
}
static int search(int x[], int in){
	for (int i=0;i<x.length;i++){
		if(x[i]==in)
			return i;
	}
	return -1;
}
}