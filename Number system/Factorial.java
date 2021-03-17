import java.util.Scanner;
class Factorial{
static int number(int x){
int i = 1, fact = 1;
while (i <= x){
fact = fact * i;
i ++;
}
return fact;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
int re = number(a);
System.out.println("The product of " + a + " factorial is " + re);
}
}