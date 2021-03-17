import java.util.Scanner;
class TwoDigit_Or_Not{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = s.nextInt();
if (a >= 10 && a <= 99 || a >= -99 && a <= -10)
System.out.println(a + " is two digit number");
else
System.out.println(a + " is not a two digit number");
}
}