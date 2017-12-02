package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void test1() {
		// 1、获取当前时间
		System.out.println(new Date());
		// 2、
		System.out.println(new Date(10000000));
		// 3、获取时间的毫秒数
		System.out.println(new Date().getTime());
		// 4、比较时间
		Date date1 = new Date();
		Date date2 = new Date(1510658680403L);
		System.out.println(date1.after(date2));
	}

	public static void test2() throws ParseException {
		// 1、date-》string
		Date date = new Date();
		String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		System.out.println(str);
		// 2、String -> date
		String str1 = new String("2017-11-14");
		String str2 = "2017-10-07";
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(str2);
		System.out.println(date2);
	}

	/*
	 * Calendar基本用法
	 */
	public static void test3() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
	}

	public static void test4() {
		Date date = new Date();
		long str = date.getTime() + 20 * 24 * 60 * 60 * 1000;
		System.out.println(str);
		Date date1 = new Date(str);
		String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1);
		System.out.println(str2);
	}

	public static void main(String[] args) throws ParseException {
		test4();
	}
}
