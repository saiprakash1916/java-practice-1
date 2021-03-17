import java.util.Scanner;
class StudentMarks{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first subject marks: ");
int a = s.nextInt();
System.out.println("Enter second subject marks: ");
int b = s.nextInt();
System.out.println("Enter third subject marks: ");
int c = s.nextInt();
System.out.println("Enter fourth subject marks: ");
int d = s.nextInt();
float total = (a + b + c + d);
System.out.println ("Total marks is: " + total);
float percentage = total / 4;
System.out.println("percentage is: " + percentage);
}
}