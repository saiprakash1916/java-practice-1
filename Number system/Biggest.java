import java.util.Scanner;
class Biggest{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = s.nextInt();
System.out.println("Enter second number: ");
int b = s.nextInt();
System.out.println("Enter third number: ");
int c = s.nextInt();
System.out.println("Enter third number: ");
int d = s.nextInt();
if (a > b && a > c && a > d)
System.out.println(a + " is bigger");
else if (b > c && b > d)
System.out.println(b + " is bigger");
else if (c > d)
System.out.println(c + " is bigger");
else
System.out.println(d + " is bigger");
}
}