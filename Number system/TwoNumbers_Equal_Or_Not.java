import java.util.Scanner;
class TwoNumbers_Equal_Or_Not{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = s.nextInt();
System.out.println("Enter the second number: ");
int b = s.nextInt();
SameOrNot sm = new SameOrNot();
boolean rs = sm.twoNumbers(a , b);
if (rs == true)
System.out.println(rs + " both numbers are same");
else
System.out.println(rs + " both numbers are different");
}
}