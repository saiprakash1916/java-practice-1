import java.util.Scanner;
class ReverseNumber{
static int numberReverse(int x){
int reversed = 0;
while (x != 0){
int digit = x % 10;
reversed = reversed * 10 + digit;
x = x / 10;
}
return reversed;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
int re = numberReverse(a);
System.out.println("Given number is " + a + " reverse number is " + re);
}
}