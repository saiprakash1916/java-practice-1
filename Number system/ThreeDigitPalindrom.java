import java.util.*;
class ThreeDigitPalindrom{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of m :");
int m=s.nextInt();
System.out.println("Enter the value of m :");
int n=s.nextInt();
ispalindrom(m,n);
}
static void ispalindrom(int m,int n){
for(int i=m;i<=n;i++){
int reverse=0,l=i;
while(l!=0){
int a=l%10;
reverse=reverse*10+a;
l=l/10;
}
if(reverse==i)
System.out.println(i);
}
}
}