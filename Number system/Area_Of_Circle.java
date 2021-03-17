import java.util.Scanner;
class Area_Of_Circle{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number to find the area of the circle: ");
float a = s.nextFloat();
Circle c = new Circle();
float f = c.radius(a);
System.out.println(f);
}
}