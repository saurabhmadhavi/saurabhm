package p1;

import java.util.Date;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdrivers.chrome.drivers", "Users/saurabh/Downloads/chromedriver_win32.exe");
		// TODO Auto-generated method stub
		 Date d1 = new Date();
	        System.out.println("Current date is " + d1);
	        Date d2 = new Date(2323223232L);
	        System.out.println("Date represented is "+ d2 );

	}

}
