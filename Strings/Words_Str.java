class Words_Str
{
      public static void main(String[] args)
     {
          String st="There is a party today";
         int s=getWords(st);
           System.out.println(s);
   }

static int getWords(String str)
{
       int count=0;
     for(int i=0;i<str.length();i++)
    {
         count++;
  }
return count;
}
}