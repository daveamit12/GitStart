package coreProgram;

public class CommaSeprEx
{ 
public static void main(String[] args)
{
	String str="ABC-DEF-FGI";
	
	String str3=str.replace("-", ",");
	System.out.println("Str3:==="+str3);
	String [] str2=str.split("-");
	
	
	
	for(String s:str2)
		System.out.println("O/p:==="+s);
}

}
