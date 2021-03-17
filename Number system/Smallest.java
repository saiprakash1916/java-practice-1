import java.util.Scanner;
class Smallest{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int x = s.nextInt();
System.out.println("Enter second number: ");
int y = s.nextInt();
System.out.println("Enter third number: ");
int z = s.nextInt();
if (x < y && x < z)
System.out.println(x + " is smaller");
else if (y < z)
System.out.println(y + " is smaller");
else
System.out.println(z + " is smaller");
}
}