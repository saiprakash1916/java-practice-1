import java.util.Scanner;
class ReverseTheWordSentence{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		char ch[]=st.toCharArray();
		st=" ";
		for(int i=0;i<ch.length;i++){
			int f=i;
			while(i<ch.length&&ch[i]!=' ' ){
				i++;
			}
			int j=i-1;
			while(j>=f){
				st=st+ch[i];
				j--;
			}
			if(i<ch.length)
				st=st+ch[i];
		}
		System.out.println(st);
	}
}