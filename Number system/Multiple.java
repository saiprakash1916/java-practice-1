import java.util.Scanner;
class Multiple{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
if (a % 3 == 0)
System.out.println(a + " is multiple by 3");
else
System.out.println(a + " is not multiple by 3");
}
}