package coreProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DateBillerEx
{

	
public static void main(String[] args)
	{
		
	
	List l2=(List) Arrays.asList("1","2","1","2","5","1");//Date
	List l1=(List) Arrays.asList("b1","b2","b3","b4","b5","B6");   //billerId
	
	HashMap<String, String> outMap = new HashMap<String, String>();
	
	for(int i=0;i<l1.size();i++) {
		String id = l1.get(i).toString();
		String date = l2.get(i).toString();
		
		String str = outMap.get(date);
		
		if(str == null) {
			outMap.put(date, id);
		}else {
			outMap.put(date, str + "-" + id
							);
		}
		
		
		
	}
		
	System.out.println("=====>"+outMap + "===Size"+outMap.size());
	
	Iterator<Entry<String, String>> itr = outMap.entrySet().iterator();
	
	while(itr.hasNext()()) {
		String dat = itr.
		String ids = outMap.get(dat);
		
		System.out.println(dat + "=====>"+ids);
	}
	
	/*Map hm=new HashMap<String, Integer>();
	
	for(int i=0;i<l1.size();i++) {
		hm.put(l1.get(i), l2.get(i));
		
	}*/
	
	}
	
	

	/*public static void main(String[] args) {
		String dates = "5,5,3,5,5,6,2";
		String ids=      "1,2,3,4,5,6,7";
		
		//5 =1-2-4-5
		//3 = 3
		//6=6
		//	7 = 2
		
	//	Map<Integer, List<String>> result = new HashMap<Integer, List<String>>();
		
	Map<String, Integer> citiesWithCodes = new HashMap<String, Integer>();
	citiesWithCodes.put("Berlin", 49);//BillerID, Date
	citiesWithCodes.put("Frankfurt", 49);
	citiesWithCodes.put("Hamburg", 49);
	citiesWithCodes.put("Cologne", 49);
	citiesWithCodes.put("Salzburg", 43);
	citiesWithCodes.put("Vienna", 43);
	citiesWithCodes.put("Zurich", 41);
	citiesWithCodes.put("Bern", 41);
	citiesWithCodes.put("Interlaken", 41);
	
	citiesWithCodes.put("A", 50);
	citiesWithCodes.put("B", 51);
	citiesWithCodes.put("C", 51);
	citiesWithCodes.put("D", 50);
	citiesWithCodes.put("E", 54);
	
	Map<Integer, List<String>> result = new HashMap<Integer, List<String>>();
	for(Entry<String,Integer> entry : citiesWithCodes.entrySet()){
	        List<String> list = new ArrayList<String>();
	        if(result.containsKey(entry.getValue()))
	            list = result.get(entry.getValue());
	        list.add(entry.getKey());
	        result.put(entry.getValue(), list);
	}
	System.out.println(result);
	
	System.out.println("size"+result.size());//no of insert:
	
	
	System.out.println("Key Set:==="+result.keySet());
	System.out.println("Key Set:==="+result.values());
	
	//INSERT INTO ABC (q,date,bileerId) values( 11,  50,"A,D"  );
	//INSERT INTO ABC (q,date,bileerId) values( 11,  51,"B,C"  );
	//INSERT INTO ABC (q,date,bileerId) values( 11,  54,"E"  );
	}
	*/	
	
	    
	    
}
