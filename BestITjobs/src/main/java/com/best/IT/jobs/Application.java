package com.best.IT.jobs;
import com.best.IT.jobs.utility.DataValidator;

public class Application {

	public static void main(String[] args) {
		
		String val="1234";
		System.out.println("Check: " +DataValidator.isName(val));
	}

}
