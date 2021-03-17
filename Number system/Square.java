import java.util.Scanner;
class Square{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter area value: ");
float a = s.nextInt();
float x = a * a;
float y = 4 * a;
System.out.println("Area of rectangle is: " + x);
System.out.println("Perimeter of rectangle is: " + y);
}
}