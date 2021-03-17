import java.util.Scanner;
class BigValue{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
float a = s.nextFloat();
System.out.println("Enter the second number: ");
float b = s.nextFloat();
if (a < b)
System.out.println(b + " is a big number");
else if (b < a)
System.out.println(a + " is a big number");
else
System.out.println(a + " and " + b + " both are same");
}
}