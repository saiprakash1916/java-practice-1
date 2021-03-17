import java.util.Scanner;
class FirstSmall{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String str=sc.nextLine();
 String s=lastChar(str);
System.out.println(s);
}    
static String lastChar(String st){
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++){
if(i==0 && ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' '){
if(ch[i]>='A' && ch[i]<='Z')
ch[i]=(char)(ch[i]+32);
}
else if(ch[i]>='a' && ch[i]<='z')
ch[i]=(char)(ch[i]-32);        
}
return new String(ch);
}
}
