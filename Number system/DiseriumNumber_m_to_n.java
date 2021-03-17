import java.util.Scanner;
class DiseriumNumber_m_to_n{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of m : ");
int m=s.nextInt();
System.out.println("Enter the value of n: ");
int n=s.nextInt();
isdiserium(m,n);
}
static void isdiserium(int x,int y){
for(int i=x;i<=y;i++){   
int sum=0,count=0;
int r=i,s=i;
while(r!=0)
{
count++;
r=r/10;
}
while(s!=0){
int a=s%10;
sum=sum+pow(a,count);
s=s/10;
count--;
}
if(sum==i)
System.out.println(i+"");
}
}
static int pow(int p,int q){
int pow=1;
for(int i=1;i<=q;i++){
pow=pow*p;
}
return pow;
}
}