import java.util.Scanner;
class Swap{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		st=swapWord(st);
		System.out.println(st);
	}
	static String swapWord(String st){
		int f=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==0 && ch[i] !=' ' || ch[i] != ' ' && ch[i-1] == ' ' ){
				f=i;
			}
			if(i==ch.length-1 && ch[i] !=' ' || ch[i] != ' ' && ch[i+1] == ' ' ){
				ch t = ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
		}
		return new String(ch);
	}
}