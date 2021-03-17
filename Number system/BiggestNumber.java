import java.util.Scanner;
class BiggestNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = s.nextInt();
System.out.println("Enter the second number: ");
int b = s.nextInt();
System.out.println("Enter the third number: ");
int c = s.nextInt();
ThreeNumbers th = new ThreeNumbers();
int re = th.numbers(a, b, c);
if (re == a)
System.out.println(re + " is bigger");
else if (re == b)
System.out.println(re + " is bigger");
else
System.out.println(re + " is bigger");
}
}