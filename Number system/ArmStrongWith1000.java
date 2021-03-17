import java.util.Scanner;
class ArmStrongWith1000{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the numer: ");
int a = s.nextInt();
isArm(a);
}
static void isArm(int x){ 
for (int i = 1; i <= x; i ++){
int n = i , m = i;
int count = 0, sum = 0;
while( m != 0){
count ++;
m = m / 10;
}
while( n != 0){
int a = n % 10;
sum = sum + pow(a, count);
n = n /10;
}
if (sum == i)
System.out.println(i + " ");
}
}
static int pow(int v, int p){
int pow = 1;
for(int j = 1;j <= p; j ++){
pow = pow * v;
}
return pow;
}
}