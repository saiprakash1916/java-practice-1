import java.util.Scanner;
class Number_or_Digit1{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
Number n = new Number();
boolean num = n.digit(a);
if (num == true)
System.out.println(num + " It is a digit");
else
System.out.println(num + " It is not a digit");
}
}
