package test;

//import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Service  {
	public static void main(String args[]) throws ParseException
	{
		SimpleDateFormat sd=new SimpleDateFormat("yyyy MMM dd");
		Date dd=sd.parse("1992 oct 12");
	}

}
