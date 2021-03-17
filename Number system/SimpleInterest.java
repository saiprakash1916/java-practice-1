import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter initial principle balance: ");
float p =s.nextFloat();
System.out.println("Enter annual interest rate: ");
float r =s.nextFloat();
System.out.println("Enter time(in yeras): ");
float t =s.nextFloat();
Interest it = new Interest();
float a = it.finalAmount(p , r, t);
System.out.println("Final amount is: " + a);
}
}