import java.util.Scanner;
class Anagram
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.nextLine();
       System.out.println("enter second string");
       String s2=sc.nextLine();
       boolean s=isAnagram(s1,s2);
     System.out.println(s);
  }

    static boolean isAnagram(String s1,String s2)
{
     int c1[]=countFreqAlpha(s1);
     int c2[]=countFreqAlpha(s2);
    for(int i=0;i<26;i++)
   {
         if(c1[i]!=c2[i])
         {
              return false;
        }
      
  }
return true;
}

static int[] countFreqAlpha(String st)
{
      int[] count=new int[26];
      for(int i=0;i<st.length();i++)
     {
         char ch=st.charAt(i);
        if(ch>='A' && ch<='Z')
            count[ch-65]++;
        else if(ch>='a' && ch<='z')
           count[ch-97]++;
     }
   return count;
}
}