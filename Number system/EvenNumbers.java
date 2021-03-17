import java.util.Scanner;
class EvenNumbers{
static int number(int x){
int sum = 0, i = 1;
while (i <= x){
if (i % 2 == 0)
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
System.out.println("The sum of " + a + " even numbers is " + re);
}
}