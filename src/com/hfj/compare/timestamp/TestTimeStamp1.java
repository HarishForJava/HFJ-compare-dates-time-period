package com.hfj.compare.timestamp;

import java.sql.Timestamp;

/**
 * @author HFJ
 *
 */
public class TestTimeStamp1 {
	public static void main(String[] args) {
		java.util.Date today = new java.util.Date();
		java.sql.Timestamp ts1 = new java.sql.Timestamp(today.getTime());
		java.sql.Timestamp ts2 = new Timestamp(System.currentTimeMillis());
		java.sql.Timestamp ts3 = java.sql.Timestamp.valueOf("2008-01-21 09:01:10");
		long tsTime1 = ts1.getTime();
		long tsTime2 = ts2.getTime();
		long tsTime3 = ts3.getTime();

		System.out.println(tsTime1);
		System.out.println(tsTime2);
		System.out.println("time in milli sec  " + Long.toString(tsTime2 - tsTime1));
		System.out.println("time in milli sec   " + Long.toString(tsTime1 - tsTime3));
	}

}
