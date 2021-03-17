import java.util.Scanner;
class LastWordCapital{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		st=lastCap(st);
		System.out.println(st);
	}
	static String lastCap(String st){
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==ch.length-1 && ch[i] !=' ' || ch[i] != ' ' && ch[i+1] == ' ' ){
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else{
				if(ch[i]>='A' && ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
}