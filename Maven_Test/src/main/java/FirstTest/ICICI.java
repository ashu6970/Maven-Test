package FirstTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ICICI {

	public static void main(String[] args) throws ParseException {
		
		String a= "100";
		String b= "120";
		int c= Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println(c);
		String Date1="22/4/2019";
		
		
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date Formated=format.parse(Date1);		
		System.out.println(Formated);
		
		String Day= new SimpleDateFormat("dd").format(Formated);
		System.out.println(Day);
	     
		String Month =new SimpleDateFormat("MMMM").format(Formated);
         System.out.println(Month);
         
         String Year=new SimpleDateFormat("YYYY").format(Formated);
         System.out.println(Year);
	}

}
