import java.util.Scanner;
class Equal_Or_Not{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = s.nextInt();
System.out.println("Enter the second number: ");
int b = s.nextInt();
if (a == b)
System.out.println("Both numbers are equal");
else
System.out.println("Both number are not equal");
}
}