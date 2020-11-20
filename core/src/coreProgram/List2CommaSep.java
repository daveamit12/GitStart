package coreProgram;

import java.awt.List;
import java.util.ArrayList;

public class List2CommaSep
{

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		int size=al.size();
		System.out.println(al.toString()+"  "+size);
		
		StringBuilder sb=new StringBuilder();
		sb.append("(");
		for(int a:al) {
			sb.append(a);
		size=size-1;
if(size>0) {
			
			sb.append(",");
			}
			
		}	
		sb.append(")");
		System.out.println("value comma:="+sb.toString());
	}

}
