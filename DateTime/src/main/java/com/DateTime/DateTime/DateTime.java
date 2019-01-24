package com.DateTime.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
	
	
	public Date LocalDateToDate(LocalDate LocalDate)
	{
		
		return Date.from(LocalDate.atStartOfDay(ZoneId.
				systemDefault()).toInstant());
			     		      
	}
	
	public ZonedDateTime LocalDateToZonedDateTime(LocalDate locald)
	{
		return locald.atStartOfDay(ZoneId.systemDefault());
	}
	
	public Date LocalDateTimeToDate(LocalDateTime localdt)
	{
		return Date.from(localdt.atZone(ZoneId.
				systemDefault()).toInstant());
	}
	
	public LocalDateTime DateToLocalDateTime(Date d)
	{
		
		
		return d.toInstant().atZone(ZoneId.
				systemDefault()).toLocalDateTime();

	}
	
	public ZonedDateTime DateToZonedTime(LocalDateTime ld)
	{
		ZoneId zoneid = ZoneId.of("Asia/Dhaka");
		
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(ld, zoneid);
		
		return zonedDateTime;
		
	}
	
	public LocalDateTime ZonedDateTimeToLocalDateTime(ZonedDateTime zdt)
	{
		return zdt.toLocalDateTime();
	}
	
	
	public OffsetDateTime DateToOffsetDateTime(LocalDateTime ld)
	{
		ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 30);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(ld, offset);
        
        return offsetDateTime;
	}
	
	public LocalDateTime OffsetDateTimeToLocalDateTime(OffsetDateTime odt)
	{
		return odt.toLocalDateTime();
	}
	
	

}
