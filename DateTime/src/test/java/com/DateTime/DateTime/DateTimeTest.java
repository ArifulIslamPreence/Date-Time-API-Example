package com.DateTime.DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTimeTest {

	@Test
	public void testLocalDateToDate() {
		
LocalDate ld = LocalDate.parse("2019-01-16")  ;
		
		String expression = "Wed Jan 16 00:00:00 BDT 2019";
		
		DateTime dt = new DateTime();
		
		assertEquals(expression,dt.LocalDateToDate(ld).toString());
		
	}

	@Test
	public void testLocalDateToZonedDateTime() {
LocalDateTime dateTime = LocalDateTime.parse("2019-01-24T17:15:15.665");
    	
    	DateTime dt = new DateTime();
    	
    	
    	
    	String s="2019-01-24T17:15:15.665+06:00[Asia/Dhaka]";
    	
    	assertEquals(s, dt.DateToZonedTime(dateTime).toString());
	}

	@Test
	public void testLocalDateTimeToDate() {
		LocalDateTime ldt = LocalDateTime.parse("2019-01-24T12:26:18.124");
 		
		DateTime dt = new DateTime();   	
    	
    	String s="Thu Jan 24 12:26:18 BDT 2019";
    	
    	assertEquals(s, dt.LocalDateTimeToDate(ldt).toString());
	}



	@Test
	public void testDateToZonedTime() {
		LocalDate ld = LocalDate.parse("2019-01-16");
    	
		DateTime dt = new DateTime(); 	
    	
    	String s="2019-01-16T00:00+06:00[Asia/Dhaka]";
    	
    	assertEquals(s, dt.LocalDateToZonedDateTime(ld).toString());
	}

	@Test
	public void testZonedDateTimeToLocalDateTime() {
		ZonedDateTime zdt = ZonedDateTime.parse("2019-01-17T12:37:06.750+06:00[Asia/Dhaka]");
 		
		DateTime dt = new DateTime(); 	  	
    	
    	String s="2019-01-17T12:37:06.750";
    	
    	assertEquals(s, dt.ZonedDateTimeToLocalDateTime(zdt).toString());
	}

	@Test
	public void testDateToOffsetDateTime() {
		DateTime dt = new DateTime();
		LocalDateTime dateTime = LocalDateTime.parse("2019-01-16T17:47:51.088");
		String s="2019-01-16T17:47:51.088+01:30";
		assertEquals(s, dt.DateToOffsetDateTime(dateTime).toString());
		
	}


}
