
public class StringExce {

public static void main(String args[])
{String str="java";
	try
	{
	for(int i=0;i<=str.length();i++)	
	{
		System.out.println(str.charAt(i));
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("String has reached its length ");
	}
}
}