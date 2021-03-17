import java.util.Scanner;
class Rectangle{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter length value: ");
float l = s.nextInt();
System.out.println("Enter width value: ");
float w = s.nextInt();
float a = (w * l);
float p = 2 * (l + w);
System.out.println("Area of rectangle is: " + a);
System.out.println("Perimeter of rectangle is: " + p);
}
}