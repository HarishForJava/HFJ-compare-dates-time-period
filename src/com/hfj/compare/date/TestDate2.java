package com.hfj.compare.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HFJ
 *
 */
public class TestDate2 {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2007-12-31");
		Date date2 = sdf.parse("2018-01-31");

		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		if (date1.after(date2)) {
			System.out.println("Date1 is after Date2");
		}

		if (date1.before(date2)) {
			System.out.println("Date1 is before Date2");
		}

		if (date1.equals(date2)) {
			System.out.println("Date1 is equal Date2");
		}

	}
}
