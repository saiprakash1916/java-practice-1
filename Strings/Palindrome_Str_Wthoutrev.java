import java.util.Scanner;
class Palindrome_Str_Wthoutrev
{
   public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
     System.out.println("enter string");
     String s=sc.nextLine();
    boolean c=palindrome(s);
     System.out.println(c);
  }
    
    static boolean palindrome(String st)
   {
       char ch[]=st.toCharArray();
       int i=0,j=ch.length-1;
        while(i<=j)
       {
              if(ch[i]!=ch[j])
                 return false;
             i++;
             j--;
        }
      return true;
  }
}