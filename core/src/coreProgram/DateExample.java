package coreProgram;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample
{
	
	public static void main(String[] args)
	{
		String strDateFormat = ("dd-MM-yyyy ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -6);
		java.util.Date result = cal.getTime();
		System.out.println(" 6 month back:="+result);
		
		
		   Date date = new Date();
		   DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		
		   String formattedDate= sdf.format(date);		   
		   String sixMonthBAck=dateFormat.format(result);
		   
		   

		    System.out.println("Current time of the day using Date:= " + formattedDate);
		    
		    System.out.println(" 6 month back:="+sixMonthBAck);
		    
		    try
			{
				Date sixMonthBAck2222=new SimpleDateFormat().parse(sixMonthBAck);
				System.out.println("sixMonthBAck2222:==="+sixMonthBAck2222);
			}
			catch (ParseException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    
		
		Date d=new DateExample().getStartOfDay(new Date());
		Date end=new DateExample().getEndOfDay(new Date());
		System.out.println("d:="+d+" End:="+end +" date:=========="+new Date());
		
		
		Date ddd=new Date();
		System.out.println("ddd:="+ddd);
		SimpleDateFormat format=new SimpleDateFormat("DD-MMM-YYYY");
		String dd=format.format(ddd);
		System.out.println("dd:="+dd);
		try
		{
			Date ddddd=new SimpleDateFormat().parse(dd);
			System.out.println("ddddd:="+ddddd);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	
	
	Calendar calStart = new GregorianCalendar();
	calStart.setTime(new Date());
	calStart.set(Calendar.HOUR_OF_DAY, 0);
	calStart.set(Calendar.MINUTE, 0);
	calStart.set(Calendar.SECOND, 0);
	calStart.set(Calendar.MILLISECOND, 0);
	Date midnightYesterday = calStart.getTime();
	
	SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SS ");//at("dd/MM/yyyy HH:mm:ss.SS");
	
	SimpleDateFormat format5 = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
	
	System.out.println("midnight:="+midnightYesterday);
	String s=sdf2.format(midnightYesterday);
	System.out.println("midnight:="+s);
	
	String s5=format5.format(midnightYesterday);
	System.out.println("s5:="+s5);
	
	String curDate=sdf2.format(new Date());
	System.out.println("cur date:="+curDate);
	
	
   

    
    

 
	
	
	}
	
	private Date getStartOfDay(Date date) {
	    Calendar calendar = Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    calendar.set(year, month, day, 0, 0, 0);
	    return calendar.getTime();
	}
	
	private Date getEndOfDay(Date date) {
	    Calendar calendar = Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    calendar.set(year, month, day, 23, 59, 59);
	    return calendar.getTime();
	}
}
