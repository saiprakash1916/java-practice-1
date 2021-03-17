import java.util.Scanner;
class PerfectNumbersWithIn_n{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of m :");
int m=s.nextInt();
System.out.println("Enter the value of m :");
int n=s.nextInt();
isperfect(m,n);
}
static void isperfect(int m,int n){
for(int i=m;i<=n;i++){
int res=i,sum=0;
for(int j=1;j<=res/2;j++){
if(res % j == 0)
sum = sum+j; 
}
if(sum==i)
System.out.println(i);
}       
}
}