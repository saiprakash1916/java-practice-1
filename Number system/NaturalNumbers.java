import java.util.Scanner;
class NaturalNumbers{
static int number(int x){
int sum = 0, i = 0;
while (i <= x){
sum = sum + i;
i ++;
}
return sum;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
int re = number(a);
System.out.println("The sum of " + a + " natural numbers is " + re);
}
}