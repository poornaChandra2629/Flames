import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first name for calculating flames");
		Scanner sc=new Scanner(System.in);
		String fn=sc.nextLine();
		String result=fn;
		fn=fn.toLowerCase();
		System.out.println("Enter second name for calculating Flames");
		String sn=sc.nextLine();
		result=result+" and "+sn;
		sn=sn.toLowerCase();
		fn=fn.replaceAll("\\s", "");
		sn=sn.replaceAll("\\s", "");
		int[] freq=new int[26];
		for(int i=0;i<fn.length();i++)
		{
			freq[fn.charAt(i)-97]++;
		}
		for(int i=0;i<sn.length();i++)
		{
			freq[sn.charAt(i)-97]--;
		}
		int count=0;
		for(int i=0;i<26;i++)
		{
			count=count+Math.abs((int)freq[i]);
		}
		String flames="FLAMES";
		while(flames.length()!=1) {
			int y=count%flames.length();
			if(y!=0) {
				flames=flames.substring(y)+flames.substring(0, y-1);
			}
			else {
				flames=flames.substring(0, flames.length()-1);
			}
		}
		switch(flames.charAt(0)){
		case 'F':
			System.out.println(result +" are Friends");
			break;
		case 'L':
			System.out.println(result +" are Lovers");
			break;
		case 'A':
			System.out.println(result +" having Attraction on each other");
			break;
		case 'M':
			System.out.println(result +" are going to Married soon");
			break;
		case 'E':
			System.out.println(result +" are Enemies");
			break;
		case 'S':
			System.out.println(result +" are Siblings");
			break;
		default:
			System.out.println(result +" sorry can't find Relation");
		}
		System.out.println();
		System.out.println("\t"+result +"\n\n\t ALL THE BEST FOR BOTH OF YOU");
		

	}

}
