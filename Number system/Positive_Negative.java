import java.util.Scanner;
class Positive_Negative{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
float num = s.nextFloat();
if (num > 0.0)
System.out.println(num + " is positive");
else if (num < 0.0)
System.out.println(num + " is negative");
else
System.out.println(num + " is also positive number");
}
}