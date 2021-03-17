import java.util.*;
class HappyNumberWithin_1000{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of m :");
int m=s.nextInt();
System.out.println("Enter the value of m :");
int n=s.nextInt();
isHappy(m,n);
}
static void isHappy(int a,int b){
for(int i=a;i<=b;i++){
if(i==1||i==7){
System.out.println(i+" ");
}    
else {
int n=i,m=i;
while(n>9){
int sum=0,count=0;
while(m!=0)
{
int r=m%10;
sum=sum+r*r;
m=m/10;
}
if(sum<=9){
if(sum==1||sum==7)
System.out.println(i+ " ");
break;
}	
else{
n=sum;
m=sum;
}
}
}
}
}
}