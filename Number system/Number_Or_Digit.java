import java.util.Scanner;
class Number_Or_Digit{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = s.nextInt();
if (a > -10 && a < 10)
System.out.println(a + " is digit");
else
System.out.println(a + " is number");
}
}