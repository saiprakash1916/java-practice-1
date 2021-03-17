import java.util.Scanner;
class CircleRadius{
public static void main(String args[]){
float p = 3.143f;
Scanner s = new Scanner(System.in);
System.out.println("Enter radius value: ");
int r = s.nextInt();
float a = (p * r * r);
float c = (2 * p * r);
System.out.println("Area of circle is: " + a);
System.out.println("Circumference of circle is: " + c);
}
}