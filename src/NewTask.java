
public class NewTask {

	public static void main(String[] args) {
		
	String str="MORESHWAR";
	
	String rep=str.replace("RESH", "");
		System.out.println(rep);
		String temp="";
		for (int i=rep.length()-1;i>=0;i--)
		{
			temp=temp+rep.charAt(i);
			
			
		}
		
		System.out.println(temp);
	}
	}
		
		/*String str[]="This is Testing".split(" ");
	String temp="";
	for(int i=0;i<str.length;i++)
	{
		
		
		temp+=str[i]+ " ";
	//	temp=temp+str.charAt(i);
		System.out.println(temp);	
	}
	
	
	
	}
	
}*/



