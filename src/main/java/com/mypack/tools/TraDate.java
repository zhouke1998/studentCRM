package com.mypack.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TraDate {

	public static Date traDate(String time) throws ParseException{
		SimpleDateFormat StrToDate = null;
		if(time.length()<=17){
			StrToDate = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		}else{
			StrToDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		Date time2 = StrToDate.parse(time.replace("T", " "));
		return time2;
	}
}
