import java.util.Scanner;
class Temperature{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the temperature in celsius: ");
float t = s.nextInt();
float f = (t * 9 / 5) + 32 ;
System.out.println("Temperature in fahrenheit is: " + f);
}
}